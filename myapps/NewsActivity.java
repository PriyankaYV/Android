package com.example.priyanka.myapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NewsActivity extends AppCompatActivity {
    public static final String NEWS_TYPE = "news_type";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

   public void fetchNews(View view){
       Intent newsIntent = new Intent(getBaseContext(),NewsReadActivity.class);
       switch (view.getId()){

           case R.id.btnAppleNews:
               newsIntent.putExtra(NEWS_TYPE,"https://www.apple.com");
               startActivity(newsIntent);
               break;

           case R.id.btnGoogleNews:
               newsIntent.putExtra(NEWS_TYPE,"https://www.google.com");
               startActivity(newsIntent);
               break;

           case R.id.btnFelightNews:
               newsIntent.putExtra(NEWS_TYPE,"https://www.felight.com");
               startActivity(newsIntent);
               break;
       }

   }
}
