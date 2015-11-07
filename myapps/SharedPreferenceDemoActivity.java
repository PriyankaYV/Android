package com.example.priyanka.myapps;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferenceDemoActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private String myPref = "MyPref";
    private final String USER_NAME_KEY = "Username";
    EditText etName;
   // Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference_demo);
        etName = (EditText)findViewById(R.id.etUser);
       // btnSave = (Button)findViewById(R.id.btnSave);
        sharedPreferences = getSharedPreferences(myPref, Context.MODE_PRIVATE);
        etName.setText(sharedPreferences.getString(USER_NAME_KEY,"No username"));


    }

    public void save(View view){
        String userName = etName.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_NAME_KEY,userName);
        editor.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_shared_preference_demo,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
