package com.example.priyanka.myapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by PRIYANKA on 10/14/2015.
 */
public class MyJokes extends Activity {

    String[] myJoke = {"Hellozzz.. Click next to laugh","Unfortunately.. :( Nothing to laugh much...!!","Thank you...!!"};
    int jokeIndex = 0;
    TextView tvjokes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_myjokes);
        TextView tvjokes = (TextView)findViewById(R.id.tvJoke);
        tvjokes.setText(myJoke[jokeIndex]);
    }

    public void onClickButton(View view){

        tvjokes = (TextView)findViewById(R.id.tvJoke);
        switch(view.getId()){
            case R.id.imBtnNext:
                if(jokeIndex<myJoke.length-1){
                    jokeIndex++;
                    tvjokes.setText(myJoke[jokeIndex]);
                }
                break;
            case R.id.imBtnPrev:
                if(jokeIndex>0){
                    jokeIndex--;
                    tvjokes.setText((myJoke[jokeIndex]));
                }
                break;
        }

    }
}
