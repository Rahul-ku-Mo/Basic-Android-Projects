package com.example.multiplicationtable;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2;
    ListView listView;
    SeekBar seekBar;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView) findViewById(R.id.textView);
        listView = (ListView) findViewById(R.id.listView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setText(seekBar.getProgress() + "/" + seekBar.getMax());
        //seekBar.setMax(25);
    //    seekBar.setMin(1);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pval=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            //   Toast.makeText(MainActivity.this, "Table of " + progress, Toast.LENGTH_SHORT).show();
               populate(progress);
                pval=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView2.setText(pval + "/" + seekBar.getMax());
            }
        });
    }

    public void populate(int table){

        ArrayList<String> mulTable  = new ArrayList<>();
        for (int i =1; i<=10;i++){
            mulTable.add(table + " X " + i + " = " + table*i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mulTable);
        listView.setAdapter(arrayAdapter);


    }
}
