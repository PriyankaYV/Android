package com.example.priyanka.myapps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);
    }
    public void Navigate(View view){

        switch(view.getId()){

            case R.id.imBtnGreet:
                Intent intentGreet = new Intent(this,GreetActivity.class);
                startActivity(intentGreet);
                Vibrator v = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(200);
                break;

            case R.id.imBtnCalci:
                Intent intentCalci = new Intent(this,Calculator.class);
                startActivity(intentCalci);
                Vibrator vc = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vc.vibrate(200);
                break;

            case R.id.imBtnJokes:
                Intent intentJokes = new Intent(this,MyJokes.class);
                startActivity(intentJokes);
                Vibrator vb = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(200);
                break;

            case R.id.imBtnInstagram:
                Intent intentInstagram = new Intent(this,InstagramCloneActivity.class);
                startActivity(intentInstagram);
                Vibrator vi = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(200);
                break;

            case R.id.imBtnNews:
                Intent intentNews = new Intent(this,NewsActivity.class);
                startActivity(intentNews);
                Vibrator vn = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vn.vibrate(200);
                break;

            case R.id.imBtnMusic:
                Intent intentMusic = new Intent(this,AudioPlayer.class);
                startActivity(intentMusic);
                Vibrator vm = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vm.vibrate(200);
                break;

            case R.id.imBtnCamera:
                Intent intentcam = new Intent(this,MyCameraActivity.class);
                startActivity(intentcam);
                Vibrator vci = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vci.vibrate(200);
                break;


            case R.id.imBtnLifeCycle:
                Intent intentlife = new Intent(this,LifeCycleActivity.class);
                startActivity(intentlife);
                Vibrator vl = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vl.vibrate(200);
                break;

            case R.id.imBtnUser:
                Intent intentUser = new Intent(this,UserDataActivity.class);
                startActivity(intentUser);
                Vibrator vu = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vu.vibrate(200);
                break;

            case R.id.imBtnCallNMesg:
                Intent intentCallnMesg = new Intent(this,CallAndMessage.class);
                startActivity(intentCallnMesg);
                Vibrator vcm = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vcm.vibrate(200);
                break;

            case R.id.imBtnSensor:
                Intent intentSensor = new Intent(this,SensorListActivity.class);
                startActivity(intentSensor);
                Vibrator vs = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vs.vibrate(200);
                break;

            case R.id.imBtnAccelerometer:
                Intent intentAccelerometer = new Intent(this,ReadingSensorValue.class);
                startActivity(intentAccelerometer);
                Vibrator va = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                va.vibrate(200);
                break;

            case R.id.imBtnAnimation:
                Intent intentAnimation = new Intent(this,AnimateActivity.class);
                startActivity(intentAnimation);
                Vibrator vba = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vba.vibrate(200);
                break;

            case R.id.imBtnShake:
                Intent intentShake = new Intent(this,ShakeActivity.class);
                startActivity(intentShake);
                Vibrator vbs = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vbs.vibrate(200);
                break;

            case R.id.imBtnSort:
                Intent intentSort = new Intent(this,SortingActivity.class);
                startActivity(intentSort);
                Vibrator vis = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vis.vibrate(200);
                break;

            case R.id.imBtnMap:
                Intent intentMap = new Intent(this,MapsActivity.class);
                startActivity(intentMap);
                Vibrator vmb = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
                vmb.vibrate(200);
                break;

        }
    }

}
