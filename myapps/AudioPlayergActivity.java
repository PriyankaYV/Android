package com.example.priyanka.myapps;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class AudioPlayergActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Uri uri;
    ArrayList<Uri> songList;

    public void selectAudio(View view){
        Intent intent=new Intent();
        intent.setType("audio/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.putExtra(Intent.EXTRA_LOCAL_ONLY, true);
        startActivityForResult(Intent.createChooser(intent, "choose file"), 1);

    }
    public void play(View view) throws IOException {


        mediaPlayer=new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(getBaseContext(), uri);//for streaming online giveUri.parse("path"); instead of uri;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer.start();
            }
        });

    }
    public void stop(View view){
        if(mediaPlayer!=null){
            mediaPlayer.stop();

        }
        else
            Toast.makeText(getBaseContext(), "Hello..Start Song First", Toast.LENGTH_SHORT).show();
    }
    public void pause(View view){

        mediaPlayer.pause();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        uri=Uri.parse(intent.getData().getPath());
        songList=new ArrayList<Uri>();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_audio_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_playerg);
    }


}
