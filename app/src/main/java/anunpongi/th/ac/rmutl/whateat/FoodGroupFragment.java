package anunpongi.th.ac.rmutl.whateat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodGroupFragment extends Fragment {
    View mainView;

    public FoodGroupFragment(){
//        FoodGroupFragment controller


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_food_group, container, false);

        setButton(R.id.Group001,1);
        setButton(R.id.Group002,2);
        setButton(R.id.Group003,3);
        setButton(R.id.Group004,4);
        setButton(R.id.Group005,5);
        setButton(R.id.Group006,6);
        setButton(R.id.Group007,7);
        setButton(R.id.Group008,8);
        setButton(R.id.Group009,9);
        setButton(R.id.Group0010,10);
        setButton(R.id.Group0011,11);
        setButton(R.id.Group0012,12);
        setButton(R.id.Group0013,13);
        setButton(R.id.Group0014,14);
        setButton(R.id.Group0015,15);


        return mainView;
    }

    private void setButton(int btnId, final int groupId){
        final Button btn = mainView.findViewById(btnId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodList.selectedFoodGroup = groupId;
                getFragmentManager().beginTransaction().replace(R.id.contentFragmentMain, FoodListFragment.newInstance(groupId,btn.getText().toString())).commit();
            }
        });
    }

}
