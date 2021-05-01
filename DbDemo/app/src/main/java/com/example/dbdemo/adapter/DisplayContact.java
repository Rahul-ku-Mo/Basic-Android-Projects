package com.example.dbdemo.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dbdemo.R;

public class DisplayContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String name = intent.getStringExtra("Rname");
        String phoneNumber = intent.getStringExtra("RPhoneNo.");

        // Capture the layout's TextView and set the string as its text
        TextView displayName = findViewById(R.id.displayName);
        displayName.setText(name);
        TextView displayPhoneNumber = findViewById(R.id.displayPhoneNumber);
        displayPhoneNumber.setText(phoneNumber);

    }
}