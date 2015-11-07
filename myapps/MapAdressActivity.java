package com.example.priyanka.myapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by PRIYANKA on 10/30/2015.
 */
public class MapAdressActivity extends Activity {
    TextView tvNews;
    WebView wvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapaddress);
        tvNews =(TextView) findViewById(R.id.tvNewsPrinted);
        wvResult = (WebView)findViewById(R.id.wvResult);
        Intent intent = getIntent();
        String sp = intent.getStringExtra(MapsActivity.NEWS_TYPE);
        tvNews.setText(sp);
        wvResult.loadUrl(sp);
        wvResult.setWebViewClient(new WebViewClient());
    }
}
