package anunpongi.th.ac.rmutl.whateat;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormFragment extends Fragment {

    Spinner spinner;
    EditText name;
    EditText surname;
    EditText weight;
    EditText tall;
    EditText age;
    View mainVIew;
    RadioButton radMale;
    RadioButton radFemale;

    //    true Not Choose Age
    private boolean statureABoolean = true;


    public FormFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }   //Main Methon


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainVIew = inflater.inflate(R.layout.fragment_form, container, false);

        setTextView();

        setGender();

        setActive();

        setButton();

//        checkSQLite();

        return mainVIew;
    }

    private void setButton() {
        Button button = mainVIew.findViewById(R.id.btnSave);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                Calculater.calculateDaily(getTall(), getAge(), getWeight(), getIsMale(), getActive());
                try {
                    saveData();
                } catch (Exception e) {
                    Toast.makeText(getContext(), "กรุณากรอกข้อมูลให้ครบถ้วน", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void saveData() {
        MyManage myManage = new MyManage(getContext());
        long z = myManage.deleteUser();
        long x = myManage.addValueToSQLite(getName(), getSurName(), getIsMale().toString(), getAge().toString(), getTall().toString(), getWeight().toString(), getActive().toString());
        Log.d("test", Long.toString(x));
        InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
        getFragmentManager().beginTransaction().replace(R.id.contentFragmentMain, new MainFragment()).commit();
    }

    private void setActive() {
        spinner = mainVIew.findViewById(R.id.active);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.active_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setSelection(Calculater.active);
    }

    @SuppressLint("SetTextI18n")
    private void setTextView() {
        name = mainVIew.findViewById(R.id.edtName);
        surname = mainVIew.findViewById(R.id.edtSurname);
        age = mainVIew.findViewById(R.id.age);
        tall = mainVIew.findViewById(R.id.tall);
        weight = mainVIew.findViewById(R.id.weight);

        name.setText(Calculater.name);
        surname.setText(Calculater.surname);
        if (0 != Calculater.age) {
            age.setText(Calculater.age + "");
        }
        if (0 != Calculater.tall) {
            tall.setText(Calculater.tall + "");
        }
        if (0 != Calculater.weight) {
            weight.setText(Calculater.weight + "");
        }
    }

    private void setGender() {
        radMale = mainVIew.findViewById(R.id.radMale);
        radFemale = mainVIew.findViewById(R.id.radFamale);
        if (Calculater.isMale) {
            radMale.setChecked(true);
            radFemale.setChecked(false);
        } else {
            radMale.setChecked(false);
            radFemale.setChecked(true);
        }
    }

    private Boolean getIsMale() {
        return radMale.isChecked();
    }

    private String getName() {
        return name.getText().toString();
    }

    private String getSurName() {
        return surname.getText().toString();
    }

    private Integer getAge() {
        return Integer.parseInt(age.getText().toString());
    }

    private Integer getTall() {
        return Integer.parseInt(tall.getText().toString());
    }

    private Integer getWeight() {
        return Integer.parseInt(weight.getText().toString());
    }

    private Integer getActive() {
        return spinner.getSelectedItemPosition();
    }

}
