package com.example.priyanka.myapps;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimateActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate);
        imageView = (ImageView)findViewById(R.id.imBtnAnimate);
        button = (Button)findViewById(R.id.btnAnimate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView,"rotation",0,40,80,360,100,400,-700,360,80,40,0);
                objectAnimator.setDuration(6000);
                objectAnimator.start();
            }
        });
    }
}
