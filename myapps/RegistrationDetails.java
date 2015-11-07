package com.example.priyanka.myapps;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationDetails extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    private final String UserInfo1= "UserInfo1";
    private final String UserInfo2= "UserInfo2";

    SharedPreferences sharedPreferences1;
    SharedPreferences sharedPreferences2;

    private final String NAME_KEY="Name";
    private final String EMAIL_KEY="Email";
    private final String LOCATION_KEY="Location";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_details);
        sharedPreferences1 = getSharedPreferences(UserInfo1, Context.MODE_PRIVATE);
        sharedPreferences2 = getSharedPreferences( UserInfo2, Context.MODE_PRIVATE);


        tv1 = (TextView)findViewById(R.id.na1);
        tv2 = (TextView)findViewById(R.id.ma1);
        tv3 = (TextView)findViewById(R.id.lo1);
        tv4 = (TextView)findViewById(R.id.na2);
        tv5 = (TextView)findViewById(R.id.ma2);
        tv6 = (TextView)findViewById(R.id.lo2);

        tv1.setText(sharedPreferences1.getString(NAME_KEY,""));
        tv2.setText(sharedPreferences1.getString( EMAIL_KEY,""));
        tv3.setText(sharedPreferences1.getString(LOCATION_KEY, ""));

        tv4.setText(sharedPreferences2.getString(NAME_KEY,""));
        tv5.setText(sharedPreferences2.getString( EMAIL_KEY,""));
        tv6.setText(sharedPreferences2.getString(LOCATION_KEY,""));


    }

  public void saveInformation(View view){


        SharedPreferences.Editor editor1 = sharedPreferences1.edit();
        editor1.putString(NAME_KEY,tv1.getText().toString());
      editor1.putString(EMAIL_KEY,tv2.getText().toString());
      editor1.putString(LOCATION_KEY, tv3.getText().toString());
      editor1.commit();


      SharedPreferences.Editor editor2 = sharedPreferences2.edit();
      editor2.putString(NAME_KEY,tv4.getText().toString());
      editor2.putString(EMAIL_KEY,tv5.getText().toString());
      editor2.putString(LOCATION_KEY, tv6.getText().toString());
      editor2.commit();


   }
    public void displayInfo(View view){
        Toast.makeText(RegistrationDetails.this,"Name:"+sharedPreferences1.getString(NAME_KEY,"")
                +"\n"+ "Email: "+sharedPreferences1.getString(EMAIL_KEY,"")
                + "\n"+ "Location: "+sharedPreferences1.getString(LOCATION_KEY,"")
                +"Name: "+sharedPreferences2.getString(NAME_KEY,"")
                        +"\n"+ "Email: "+sharedPreferences2.getString(EMAIL_KEY,"")
                        + "\n"+ "Location: "+sharedPreferences2.getString(LOCATION_KEY,""),Toast.LENGTH_SHORT).show();
    }



}
