package com.foo.umbrella.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.foo.umbrella.R;

public class MainActivity extends AppCompatActivity {
  SharedPreferences sharedPreferences;
  public static final String SHARED_EXTRA_MESSAGE="com.foo.umbrella_SHARED_EXTRA_MESSAGE";
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    LoadZipPreferences();
  }
  /*Checking if Zip and Metrics are set*/
  public void LoadZipPreferences() {
     sharedPreferences= this.getSharedPreferences(
            getString(R.string.com_foo_umbrella_zip_preference), MODE_PRIVATE);
    if (sharedPreferences.getInt(getString(R.string.com_foo_umbrella_zip_preference), 0) == 0||
            sharedPreferences.getInt(getString(R.string.com_foo_umbrella_metrics_preference),0)==0) {
      Intent intent = new Intent(MainActivity.this, OptionsWeather.class);
      intent.putExtra(SHARED_EXTRA_MESSAGE,0);
      startActivity(intent);
    }
  }

}
