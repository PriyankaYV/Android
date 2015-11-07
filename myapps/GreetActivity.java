package com.example.priyanka.myapps;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by PRIYANKA on 10/14/2015.
 */
public class GreetActivity extends Activity {

    Button button;
    EditText editText;
    TextView textView;
    String name;
    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetuser);
        mediaplayer = MediaPlayer.create(this,R.raw.music);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();

                if (name.equals("")) {
                    Toast.makeText(GreetActivity.this, "Oops... Forgot to enter the name..?", Toast.LENGTH_SHORT).show();
                } else {
                    textView.setText("Welcome" + " " + name);
                    textView.setVisibility(View.VISIBLE);
                }

            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaplayer.stop();
    }
}
