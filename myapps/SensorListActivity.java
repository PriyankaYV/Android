package com.example.priyanka.myapps;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

public class SensorListActivity extends AppCompatActivity {

    private TextView tvSensorList;
    private SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_list);
        tvSensorList =(TextView) findViewById(R.id.tvSensorList);
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder sensorData = new StringBuilder();
        for (Sensor sensor:sensorList){
            sensorData.append("Name:" +sensor.getName()+"\n"+"Vendor:"+sensor.getVendor()+"\n"+"Power:"+sensor.getPower()+"\n");
            tvSensorList.setText(sensorData);
        }
    }
}
