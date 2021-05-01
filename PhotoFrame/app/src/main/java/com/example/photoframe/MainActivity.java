package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] str = {"Book With Scenery","Mountains","Angel"};
 ImageButton prev,next;
 TextView textView;
 ImageView book;
 int currentImage=0;
 public void prev(View view)
 {
     textView=findViewById(R.id.textView);
    String idX = "book" + currentImage;
    int x = this.getResources().getIdentifier(idX,"id",getPackageName());
    book = findViewById(x);
    book.setAlpha(0f);

     currentImage = ((3 + currentImage) - 1) % 3;
     String idY = "book" + currentImage;
     int y = this.getResources().getIdentifier(idY,"id",getPackageName());
     book = findViewById(y);
     book.setAlpha(1f);
     textView.setText(str[currentImage]);
 }
 public void next(View view)
 {  textView=findViewById(R.id.textView);
     String idX = "book" + currentImage;
     int x = this.getResources().getIdentifier(idX,"id",getPackageName());
     book = findViewById(x);
     book.setAlpha(0f);

     currentImage = (currentImage + 1) % 3;
     String idY = "book" + currentImage;
     int y = this.getResources().getIdentifier(idY,"id",getPackageName());
     book = findViewById(y);
     book.setAlpha(1f);
     textView.setText(str[currentImage]);
 }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}