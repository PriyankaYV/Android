package com.example.priyanka.myapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by PRIYANKA on 10/14/2015.
 */
public class Calculator extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    public void onButtonClick(View view){

        TextView tv = (TextView)findViewById(R.id.textView);

        EditText ed1 = (EditText)findViewById(R.id.etNumber1);
        EditText ed2 = (EditText)findViewById(R.id.etNumber2);

        double num1,num2,result = 0;

        num1 = Double.parseDouble(ed1.getText().toString());
        num2 = Double.parseDouble(ed2.getText().toString());

        switch(view.getId()){

            case R.id.btnAdd:
                result = num1 + num2;
                break;
            case R.id.btnSub:
                result = num1 - num2;
                break;
            case R.id.btnMutiply:
                result = num1*num2;
                break;
            case R.id.btnDivide:
                result = num1/num2;
                break;

        }
        tv.setText(result + "");
    }


}
