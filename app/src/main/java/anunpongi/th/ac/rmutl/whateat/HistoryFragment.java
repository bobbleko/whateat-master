package anunpongi.th.ac.rmutl.whateat;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import anunpongi.th.ac.rmutl.whateat.adapter.FoodAdapter;

import static android.content.Context.MODE_PRIVATE;


public class HistoryFragment extends Fragment {
    private OnFragmentInteractionListener mListener;
    View mainView;
    Spinner date;
    ListView listView;
    TextView sum;
    ArrayList<String> dateList;
    MyManage myManage;

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_history, container, false);
        sum = mainView.findViewById(R.id.sum);
        date = mainView.findViewById(R.id.spinner);
        listView = mainView.findViewById(R.id.listView);
        myManage = new MyManage(getContext());

        setDate();

        return mainView;
    }


    private void setDate() {
        try {
            dateList = myManage.getAllDate();
            ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, dateList);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            date.setAdapter(adapter);
            date.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    setListView(dateList.get(i));
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setListView(String date) {
        ArrayList<FoodMenu> foods = myManage.getFoodByDate(date);
        FoodAdapter adapter = new FoodAdapter(getContext(), R.layout.food_item, foods, true, getFragmentManager());
        listView.setAdapter(adapter);
        int energy = 0;
        for (FoodMenu f : foods) {
            energy += f.energy;
        }
        sum.setText(energy + "");

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
