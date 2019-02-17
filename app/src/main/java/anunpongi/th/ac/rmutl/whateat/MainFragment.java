package anunpongi.th.ac.rmutl.whateat;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import anunpongi.th.ac.rmutl.whateat.adapter.FoodAdapter;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    ListView listView;
    TextView enText;
    TextView energy;
    ProgressBar progressBar;
    View mainVIew;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainVIew = inflater.inflate(R.layout.fragment_main, container, false);

        enText = mainVIew.findViewById(R.id.energy_text);
        energy = mainVIew.findViewById(R.id.daily_energy);
        listView = mainVIew.findViewById(R.id.listview);
        progressBar = mainVIew.findViewById(R.id.progressBar);

        checkSQLite();

        checkFoodListSQLite();

        return mainVIew;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("SetTextI18n")
    private void setText() {
        energy.setText(Calculater.dailyActivityEnergy.toString());
        if (Calculater.getSumEnergy() >= 0) {
            energy.setText(Calculater.getSumEnergy()+"");
            energy.setTextColor(Color.GREEN);
        } else {
            enText.setText(R.string.over_need);
            energy.setTextColor(Color.RED);
            energy.setText((Calculater.getSumEnergy() * -1)+"");
        }

        progressBar.setProgress(Calculater.getPercent());
        Log.d("test","progress + " +Calculater.getPercent());
        if(Calculater.getPercent() < 100){
            progressBar.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        }else{
            progressBar.setProgressTintList(ColorStateList.valueOf(Color.RED));
        }
    }

    private void setButton() {
        Button button = mainVIew.findViewById(R.id.add_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.contentFragmentMain, new FoodGroupFragment()).commit();
            }
        });
    }

    private void setListVIew() {
        FoodAdapter adapter = new FoodAdapter(getContext(), R.layout.food_item, Calculater.Allnum, true,getFragmentManager());
        listView.setAdapter(adapter);
    }

    private void checkSQLite() {
        boolean result = false;

        try {
            MyManage myManage = new MyManage(getContext());
            SQLiteDatabase sqLiteDatabase = getContext().openOrCreateDatabase(MyOpenHelper.database_name, MODE_PRIVATE, null);
            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM userTABER", null);
            cursor.moveToFirst();
            if (cursor.getCount() == 0) {
                getFragmentManager().beginTransaction().replace(R.id.contentFragmentMain, new FormFragment()).commit();
            } else {
                result = true;
                int weitht = Integer.parseInt(cursor.getString(cursor.getColumnIndex("Weight")));
                int tall = Integer.parseInt(cursor.getString(cursor.getColumnIndex("Weight")));
                int age = Integer.parseInt(cursor.getString(cursor.getColumnIndex("Age")));
                int active = Integer.parseInt(cursor.getString(cursor.getColumnIndex("Active")));
                boolean isMale = Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex("Gender")));
                Calculater.name = cursor.getString(cursor.getColumnIndex("Name"));
                Calculater.surname = cursor.getString(cursor.getColumnIndex("Surname"));
                Calculater.calculateDaily(tall, age, weitht, isMale, active);
            }

            Log.d("27decV1", "result = " + result);

        } catch (Exception e) {

            Log.d("27decV1", "e = " + e.toString());
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void checkFoodListSQLite() {
        boolean result = false;

        try {
            SQLiteDatabase sqLiteDatabase = getActivity().openOrCreateDatabase(MyOpenHelper.database_name, MODE_PRIVATE, null);
            ArrayList<FoodMenu> Allnum = new ArrayList<>();
            String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM food WHERE Date = '" + date+"'", null);
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                Allnum.add(new FoodMenu(Integer.parseInt(cursor.getString(cursor.getColumnIndex("ID"))),cursor.getString(cursor.getColumnIndex("Name")), Integer.parseInt(cursor.getString(cursor.getColumnIndex("Energy"))), date));
                cursor.moveToNext();
            }


            Calculater.Allnum = Allnum;

            setListVIew();

            setText();

            setButton();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
