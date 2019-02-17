package anunpongi.th.ac.rmutl.whateat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import anunpongi.th.ac.rmutl.whateat.adapter.FoodAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FoodListFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FoodListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodListFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private int foodGroupId;
    private String name;
    View mainView;

    public FoodListFragment() {
        // Required empty public constructor
    }

    public static FoodListFragment newInstance(int param1, String param2) {
        FoodListFragment fragment = new FoodListFragment();
        Bundle args = new Bundle();
        args.putInt("foodGroupId", param1);
        args.putString("name", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            foodGroupId = getArguments().getInt("foodGroupId");
            name = getArguments().getString("name");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_food_list, container, false);
        ListView listView = mainView.findViewById(R.id.listView);
        TextView nameText = mainView.findViewById(R.id.group);

        nameText.setText(name);
        FoodAdapter adapter = new FoodAdapter(getContext(), R.layout.food_item, FoodList.getFoodlist(foodGroupId), false,getFragmentManager());
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return mainView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
