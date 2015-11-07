package com.example.priyanka.myapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class SortingActivity extends AppCompatActivity {

    RadioGroup radio_grp;
    Button btnGenerate;
    private static int[] array;
    TextView tv,tv1,tv2,tv3;
    EditText editText;
    int size=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);

        radio_grp = (RadioGroup) findViewById(R.id.radioG);
        btnGenerate = (Button) findViewById(R.id.BtnGenerate);
        editText = (EditText)findViewById(R.id.ettext);

        tv = (TextView)findViewById(R.id.etgenerated);
        tv1 = (TextView) findViewById(R.id.ettimebubble);
        tv2 = (TextView) findViewById(R.id.editTimeSelection);
        tv3 = (TextView) findViewById(R.id.ettime);



    }
    public void onClickListen(View v) {
        try {
            size = Integer.parseInt(editText.getText().toString());
            int selectedButton = radio_grp.getCheckedRadioButtonId();

            switch (selectedButton) {

                case R.id.BtnBest:
                    array = Algorithms.arrayNaturalNUmbers(size);
                    tv.setText("The array of size" + array.length + "is created for Best Case");
                    break;

                case R.id.BtnAver:
                    array = Algorithms.arrayRandomNumbers(size);
                    tv.setText("The array of size" + array.length + "is created for Average Case");
                    break;

                case R.id.Btnworst:
                    array = Algorithms.arrayDecendingNumbers(size);
                    tv.setText("The array of size" + array.length + "is created for Worst Case");
                    break;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            Toast.makeText(this,"Dude..!! Please enter the size",Toast.LENGTH_LONG).show();
        }
    }
    public void dobubblesort(){

        if(array != null){
            int[] clone = Arrays.copyOf(array, array.length);

            long start = System.currentTimeMillis();
            Algorithms.bubbleSort(clone);
            long end = System.currentTimeMillis();
            tv1.setText((end - start) + "milliseconds");
        }
        else{
            tv1.setText("array not initialized");
        }
    }

    public void doSelectionSort(){

        if(array!=null){
            int[] clone = Arrays.copyOf(array, array.length);

            long start = System.currentTimeMillis();
            Algorithms.selectionSort(clone);
            long end = System.currentTimeMillis();
            tv2.setText((end - start) + "milliseconds");
        }
        else{
            tv2.setText("array not initialized");
        }
    }

    public void doInsertionSort(){

        if(array!=null){
            int[] clone = Arrays.copyOf(array, array.length);

            long start = System.currentTimeMillis();
            Algorithms.insertionSort(clone);
            long end = System.currentTimeMillis();
            tv3.setText((end-start)+"milliseconds");
        }
        else{
            tv3.setText("array not initialized");
        }
    }



    public void onClickSort(View v){
        switch (v.getId()){
            case R.id.btnInsertion:
                doInsertionSort();
                break;
            case R.id.btnbubble:
                dobubblesort();
                break;
            case R.id.btnselection:
                doSelectionSort();
                break;
            case R.id.btnBench:
                doInsertionSort();
                dobubblesort();
                dobubblesort();
                break;
        }
    }

}
