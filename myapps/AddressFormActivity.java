package com.example.priyanka.myapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class AddressFormActivity extends AppCompatActivity {

    EditText edAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_form);
        edAddress = (EditText)findViewById(R.id.edAddress);
    }

    public void processData(View view){
        String address = edAddress.getText().toString();
        switch(view.getId()){
            case R.id.btnSave:
                Intent intent = new Intent();
                intent.putExtra("address",address);
                setResult(RESULT_OK,intent);
                finish();
                break;

            case R.id.btnCancel:
                setResult(RESULT_CANCELED);
                finish();
                break;
        }
    }
}
