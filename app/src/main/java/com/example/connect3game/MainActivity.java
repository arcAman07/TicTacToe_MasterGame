package com.example.connect3game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int activePlayer = 0; // 0 for red player and 1 for yellow player
    boolean gameActive = true;
    double redPoints;
    double yellowPoints;
    int [] gameState = {2,2,2,2,2,2,2,2,2};
    int [][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int isWinner = 0;
    Button playAgainButton;
    TextView redText;
    double redScore;
    double yellowScore;
    TextView yellowText;
    int count = 0;
    // 0 represents red state, 1 represents yellow state and 2 represents empty state

    public void dropIn(View view) {
        redText = (TextView) findViewById(R.id.redView);
        yellowText = (TextView) findViewById(R.id.yellowView);
        ImageView counter = (ImageView) view;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameState[tappedCounter] ==2 && gameActive == true) {


            gameState[tappedCounter] = activePlayer;
            counter.setTranslationY(-1500);
            if (activePlayer == 0) {
                activePlayer = 1;
                counter.setImageResource(R.drawable.red);
                count = count+1;

            } else {
                activePlayer = 0;
                counter.setImageResource(R.drawable.yellow);
                count=count+1;

            }
            counter.animate().translationYBy(1500).setDuration(300);
            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] & gameState[winningPosition[2]] != 2) {
                    // Someone has won !!
                    gameActive = false;
                    String winner = "";
                    if (activePlayer == 1) {
                        winner = "Red";
                        redPoints = 1;
                        redScore += redPoints;
                        yellowPoints = 0;
                        yellowScore += yellowPoints;
                        isWinner = 1;
                        Toast.makeText(this, winner+" has won the game!", Toast.LENGTH_SHORT).show();
                        playAgainButton = (Button) findViewById(R.id.button);
                        playAgainButton.setVisibility(View.VISIBLE);
                        redText.setText("Red-"+redScore);
                        yellowText.setText("Yellow-"+yellowScore);

                    } else if(activePlayer==0) {
                        winner = "Yellow";
                        isWinner = 1;
                        redPoints = 0;
                        yellowPoints = 1;
                        redScore += redPoints;
                        yellowScore += yellowPoints;
                        Toast.makeText(this, winner+" has won the game!", Toast.LENGTH_SHORT).show();
                        playAgainButton = (Button) findViewById(R.id.button);
                        playAgainButton.setVisibility(View.VISIBLE);
                        redText.setText("Red-"+redScore);
                        yellowText.setText("Yellow-"+yellowScore);


                    }




                }



            }



        }
        if (count==9 ) {
            redPoints = 0.5;
            yellowPoints = 0.5;
            Toast.makeText(this, "The Game was Draw!", Toast.LENGTH_SHORT).show();
            playAgainButton = (Button) findViewById(R.id.button);
            playAgainButton.setVisibility(View.VISIBLE);
            redScore += redPoints;
            yellowScore += yellowPoints;
            isWinner = 0;
//            playAgainButton.setVisibility(View.VISIBLE);
            redText.setText("Red-"+redScore);
            yellowText.setText("Yellow-"+yellowScore);
//            Intent intent = new Intent(getApplicationContext(),ScoreActivity.class);
//            intent.putExtra("redPoints",redPoints);
//            intent.putExtra("yellowPoints",yellowPoints);
//            startActivity(intent);
        }





    }



    public void playAgain(View view) {
        Button playAgainButton = (Button) findViewById(R.id.button);
        playAgainButton.setVisibility(View.INVISIBLE);
        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        for(int i=0;i< gridLayout.getChildCount();i++) {
            ImageView counter = (ImageView) gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }
        for(int j=0;j<gameState.length;j++) {
            gameState[j] = 2;
        }
        activePlayer = 0; // 0 for red player and 1 for yellow player
        gameActive = true;
        count=0;


    }

    public void goHome(View view) {
        Button playAgainButton = (Button) findViewById(R.id.button);
        playAgainButton.setVisibility(View.INVISIBLE);
        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        for(int i=0;i< gridLayout.getChildCount();i++) {
            ImageView counter = (ImageView) gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }
        for(int j=0;j<gameState.length;j++) {
            gameState[j] = 2;
        }
        activePlayer = 0; // 0 for red player and 1 for yellow player
        gameActive = true;
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

//    public void checkScoreboard(View view) {
//        TextView winnerTextView = (TextView) findViewById(R.id.winnertextView);
//        Button playAgainButton = (Button) findViewById(R.id.button);
//        playAgainButton.setVisibility(View.INVISIBLE);
//        winnerTextView.setVisibility(View.INVISIBLE);
//        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
//
//        for(int i=0;i< gridLayout.getChildCount();i++) {
//            ImageView counter = (ImageView) gridLayout.getChildAt(i);
//            counter.setImageDrawable(null);
//        }
//        for(int j=0;j<gameState.length;j++) {
//            gameState[j] = 2;
//        }
//        activePlayer = 0; // 0 for red player and 1 for yellow player
//        gameActive = true;
//        Intent intent = new Intent(getApplicationContext(),ScoreActivity.class);
//        intent.putExtra("redPoints",redPoints);
//        intent.putExtra("yellowPoints",yellowPoints);
//        startActivity(intent);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}