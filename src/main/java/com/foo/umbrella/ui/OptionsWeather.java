package com.foo.umbrella.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;

import com.foo.umbrella.R;

public class OptionsWeather extends AppCompatActivity implements View.OnFocusChangeListener,
        AdapterView.OnItemSelectedListener{

    EditText et_zipcode;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_weather);
        et_zipcode=(EditText)findViewById(R.id.et_zip);
        et_zipcode.setOnFocusChangeListener(this);
    }
    @Override
    public void onFocusChange(View view, boolean b) {
        switch (view.getId()){
            case R.id.et_zip:
                SetZipPreferences();
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        sharedPreferences.edit().putInt(getString(R.string.com_foo_umbrella_zip_preference),
                Integer.parseInt(adapterView.getItemAtPosition(i).toString())).commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    /*
            * Setting Preferences for Zip Values*/
    public void SetZipPreferences (){
        sharedPreferences.edit().putInt(getString(R.string.com_foo_umbrella_zip_preference),
                    Integer.parseInt(et_zipcode.getText().toString())).commit();
    }
}
