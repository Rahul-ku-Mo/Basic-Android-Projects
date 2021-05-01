package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean gameActive= true;
    /*PLayer representation
    0-X
    1-O
    2-Null*/
    int activePLayer = 0;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winPositons = {{0, 1, 2},{3, 4, 5},{6, 7, 8},{0, 3, 6},{1, 4, 7},{2, 5, 8},{0, 4, 8},{2, 4, 6}};
    public void playerTap(View view){
        ImageView img = (ImageView) view;
        int tappedImage =Integer.parseInt(img.getTag().toString());
       if(!gameActive)
       {
           gameReset(view);
       }
        if(gameState[tappedImage] == 2 && gameActive)
        {
          gameState[tappedImage] = activePLayer ;
          img.setTranslationY(-1000f);
            if(activePLayer == 0)
            {
                img.setImageResource(R.drawable.x);
                activePLayer = 1;
                TextView status = findViewById(R.id.status);
                status.setText("O's Turn - Tap to PLay");
            }
            else
            {   img.setImageResource(R.drawable.o);
                activePLayer = 0;
                TextView status = findViewById(R.id.status);
                status.setText("X's Turn - Tap to PLay");
            }
            img.animate().translationYBy(1000f).setDuration(200);
        }
        for (int[] winPosition: winPositons)
        {
           if( gameState[winPosition[0]] == gameState[winPosition[1]] && gameState[winPosition[1]] == gameState[winPosition[2]] && gameState[winPosition[0]]!=2)
           { String winnerstr;
           gameActive=false;
               if(gameState[winPosition[0]]==0){
                    winnerstr ="X has won";
               }
               else
               {
                   winnerstr ="O has won";
               }
               TextView status = findViewById(R.id.status);
               status.setText(winnerstr);
           }
        }
        boolean emptySquare = false;
        for (int squareState : gameState) {
            if (squareState == 2) {
                emptySquare = true;
                break;
            }
        }
        if (!emptySquare && gameActive) {
            // Game is a draw
            gameActive = false;
            String winnerStr;
            winnerStr = "No one won";
            TextView status = findViewById(R.id.status);
            status.setText(winnerStr);
        }
    }
    public void gameReset(View view)
    {
        gameActive= true;
        activePLayer=0;
        for(int i = 0; i<gameState.length; i++)
        {
            gameState[i]=2;
        }
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

        TextView status = findViewById(R.id.status);
        status.setText("X's Turn - Tap to PLay");
    }
    public void newGame(View view)
    {

        gameActive= true;
        activePLayer=0;
        for(int i = 0; i<gameState.length; i++)
        {
            gameState[i]=2;
        }
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

        TextView status = findViewById(R.id.status);
        status.setText("X's Turn - Tap to PLay");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}