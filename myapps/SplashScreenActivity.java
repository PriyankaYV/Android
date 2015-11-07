package com.example.priyanka.myapps;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class SplashScreenActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = (ImageView)findViewById(R.id.imageView);

        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }

       /* android.os.Handler han = new android.os.Handler();
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        };
        han.postDelayed(obj, 3000);
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        /*Animation animation= AnimationUtils.loadAnimation();
        imageView.startAnimation(animation);*/

        Vibrator v = (Vibrator) getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(500);

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView,"rotation",0,20,40,60,80,100,120,150,180,210,270,360);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}





