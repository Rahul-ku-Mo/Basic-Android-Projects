package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int number=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(35000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("lpg","onTick: OK");
            }

            @Override
            public void onFinish() {
                Log.d("lpg","Finish");
            }
        }.start();

        /* Task Scheduler using Handler and Runnable
               final Handler handler = new Handler();
                Runnable run = new Runnable(){
                    @Override
                    public void run() {
                        // Code to execute

                     Toast.makeText(MainActivity.this, "This is toast " + number , Toast.LENGTH_SHORT).show();
                        handler.postDelayed(this, 1000);
                         number++;
                    }
               };
              handler.post(run); */
    }
}