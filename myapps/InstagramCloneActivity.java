package com.example.priyanka.myapps;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class InstagramCloneActivity extends Activity {
    private ImageView ivResult;
    Intent intentFromCamera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_clone);
        ivResult =(ImageView)findViewById(R.id.ivAish);

        intentFromCamera = getIntent();
        //Uri pathImageFound = (Uri)intentFromCamera.getExtras().get(Intent.EXTRA_STREAM);
        //ivResult.setImageURI(pathImageFound);

    }

    public void doImageEffects(View view){
        switch (view.getId()){

            case R.id.btnGrayScale:

                ivResult.buildDrawingCache();
                Bitmap original = ivResult.getDrawingCache();
                Bitmap bm = toGrayScale(original);
                ivResult.setImageBitmap(bm);
                break;

            case R.id.btnSophia:
                toSophia();
                break; 
        }

    }

    private Bitmap toSophia() {
        return  null;
    }

    private Bitmap toGrayScale(Bitmap bmpOriginal) {
        int width, height;
        height = bmpOriginal.getHeight();
        width = bmpOriginal.getWidth();

        Bitmap bmpGrayscale = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bmpGrayscale);
        Paint paint = new Paint();
        ColorMatrix cm = new ColorMatrix();
        cm.setSaturation(0);
        ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
        paint.setColorFilter(f);
        c.drawBitmap(bmpOriginal, 0, 0, paint);
        return bmpGrayscale;
    }
}
