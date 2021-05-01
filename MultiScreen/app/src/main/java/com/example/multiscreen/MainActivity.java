package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG="com.example.myapplication.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeOrder(View view)
    {
        //We will handle the button here.
        //build intent
        Intent intent = new Intent(this,OrderActivity.class);
        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        String message = "Order for " +editText.getText().toString() + ", " + editText2.getText().toString() + ", " + editText3.getText().toString() +  " has been successfully placed.";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}