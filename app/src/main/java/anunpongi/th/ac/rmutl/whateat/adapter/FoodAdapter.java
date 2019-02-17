package anunpongi.th.ac.rmutl.whateat.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

import anunpongi.th.ac.rmutl.whateat.Calculater;
import anunpongi.th.ac.rmutl.whateat.FoodMenu;
import anunpongi.th.ac.rmutl.whateat.MainFragment;
import anunpongi.th.ac.rmutl.whateat.MyManage;
import anunpongi.th.ac.rmutl.whateat.R;

public class FoodAdapter extends ArrayAdapter<FoodMenu> {
    Boolean isView = false;
    FragmentManager manager;

    List<FoodMenu> foodItems;
    public FoodAdapter(Context context, int resource, List<FoodMenu> objects, Boolean isView, FragmentManager manager) {
        super(context, resource, objects);
        this.foodItems = objects;
        this.isView = isView;
        this.manager = manager;
    }

    @Override
    public int getCount() {
        return foodItems.size();
    }

    @Override
    public FoodMenu getItem(int position) {
        return foodItems.get(position);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        final FoodMenu foodMenu = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.food_item, parent, false);
        }

        TextView name = convertView.findViewById(R.id.name);
        TextView energy = convertView.findViewById(R.id.energy);
        Button add = convertView.findViewById(R.id.remove);
        assert foodMenu != null;
        name.setText(foodMenu.getName());
        energy.setText(foodMenu.getEnergy() + "");

        if (isView) {
            add.setText("-");
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Calculater.Allnum.remove(foodMenu);
                    MyManage myManage = new MyManage(getContext());
                    myManage.deleteFood(foodMenu);
                    notifyDataSetChanged();
                    manager.beginTransaction().replace(R.id.contentFragmentMain, new MainFragment()).commit();
                }
            });
        } else {
            add.setText("+");
            add.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                @Override
                public void onClick(View view) {
                    Calculater.Allnum.add(foodMenu);
                    saveData(foodMenu);
                    manager.beginTransaction().replace(R.id.contentFragmentMain, new MainFragment()).commit();
                }
            });
        }

        return convertView;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void saveData(FoodMenu foodMenu) {
        MyManage myManage = new MyManage(getContext());
        long x = myManage.addFood(foodMenu);
        Log.d("test", Long.toString(x));
    }

}
