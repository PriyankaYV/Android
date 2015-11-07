package com.example.priyanka.myapps;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class AudioPlayer extends Activity {

   // private static boolean isPlaying;
   private ImageButton imBtnPlayPause;
   // MediaPlayer mediaPlayer;
    Intent intentMusicService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player);
        imBtnPlayPause = (ImageButton) findViewById(R.id.imBtnPlayPause);
        //initilize();
    }
    /*private void initilize() {
        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.music);
    }*/

    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(intentMusicService);
    }

    public void audioPlayer(View view){

        switch (view.getId()){
            case R.id.imBtnPlayPause:
                intentMusicService = new Intent(this,MusicService.class);
                startService(intentMusicService);
                /*if(isPlaying){
                    mediaPlayer.stop();
                    isPlaying = false;
                    imBtnPlayPause.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.playnew));
                   // initilize();
                } else {
                    mediaPlayer.start();
                    isPlaying = true;
                    imBtnPlayPause.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.pause));

                }*/
                break;
            case R.id.imBtnNext:
                Toast.makeText(this,"Play Next Song",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imBtnPrev:
                Toast.makeText(this,"Play Previous Song",Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
