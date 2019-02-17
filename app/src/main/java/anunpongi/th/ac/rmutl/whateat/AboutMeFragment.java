package anunpongi.th.ac.rmutl.whateat;

import android.app.Activity;
import android.arch.lifecycle.ViewModelStore;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;


public class AboutMeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );



//        group001 controller
        group001Controller();

//        group002 controller
        group002Controller();


    }

    private void group002Controller() {
        Button button = getView().findViewById( R.id.Group002 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction();
            }
        } );
    }

    private void group001Controller() {
        Button button = getView().findViewById( R.id.Group001 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );
    }


}
