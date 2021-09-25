package com.example.connect3game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FifteenSecondActivity extends AppCompatActivity {
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
    int start = 0;
    int currentTime=15;
    int currentState = 0; // 0 for the clock isn't running, 1 for the clock is running
    CountDownTimer waitTimer;
    String message;
    String winner;
    int gameGoingOn = 0; // 0 represents game is over and 1 represents game is going on
    public void dropIn (View view) {
        redText = (TextView) findViewById(R.id.redView);
        yellowText = (TextView) findViewById(R.id.yellowView);
        ImageView counter = (ImageView) view;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (start == 1) {
            if (gameState[tappedCounter] == 2 && gameActive == true) {


                gameState[tappedCounter] = activePlayer;
                counter.setTranslationY(-1500);
                if (activePlayer == 0) {
                    activePlayer = 1;
                    counter.setImageResource(R.drawable.red);
                    count = count + 1;

                } else {
                    activePlayer = 0;
                    counter.setImageResource(R.drawable.yellow);
                    count = count + 1;

                }
                counter.animate().translationYBy(1500).setDuration(300);
                for (int[] winningPosition : winningPositions) {
                    if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] & gameState[winningPosition[2]] != 2) {
                        // Someone has won !!
                        gameActive = false;
                        if (activePlayer == 1) {
                            winner = "Red";
                            redPoints = 1;
                            redScore += redPoints;
                            yellowPoints = 0;
                            yellowScore += yellowPoints;
                            gameGoingOn = 1;
                            isWinner = 1;
                            start = 1;
//                            Toast.makeText(this, winner+" has won the game!", Toast.LENGTH_SHORT).show();
                            Toast.makeText(getApplicationContext(), winner+" has won the game! Click Play Again to continue the battle!", Toast.LENGTH_LONG).show();
                            message = winner + " has won the game!";
                            playAgainButton = (Button) findViewById(R.id.button);
                            redText.setText("Red-" + redScore);
                            yellowText.setText("Yellow-" + yellowScore);

                        } else if (activePlayer == 0) {
                            winner = "Yellow";
                            isWinner = 1;
                            redPoints = 0;
                            yellowPoints = 1;
                            gameGoingOn = 1;
                            start = 1;
                            redScore += redPoints;
                            yellowScore += yellowPoints;
//                            Toast.makeText(this, winner+" has won the game!", Toast.LENGTH_SHORT).show();
                            Toast.makeText(getApplicationContext(), winner+" has won the game! Click Play Again to continue the battle!" ,Toast.LENGTH_LONG).show();
                            message = winner + " has won the game!";
                            playAgainButton = (Button) findViewById(R.id.button);
                            redText.setText("Red-" + redScore);
                            yellowText.setText("Yellow-" + yellowScore);


                        }


                    }


                }


            }
            if (count == 9) {
                winner = "Draw";
                redPoints = 0.5;
                yellowPoints = 0.5;
                start  = 1;
                count=0;
                gameGoingOn = 1;
                gameActive = false;
//                Toast.makeText(this, "The Game was Draw!", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "The Game was a Draw! Click Play Again to continue the battle!", Toast.LENGTH_LONG).show();
                message = "The Game was a Draw!";
                playAgainButton = (Button) findViewById(R.id.button);
                redScore += redPoints;
                yellowScore += yellowPoints;
                isWinner = 0;
//            playAgainButton.setVisibility(View.VISIBLE);
                redText.setText("Red-" + redScore);
                yellowText.setText("Yellow-" + yellowScore);
//            Intent intent = new Intent(getApplicationContext(),ScoreActivity.class);
//            intent.putExtra("redPoints",redPoints);
//            intent.putExtra("yellowPoints",yellowPoints);
//            startActivity(intent);
            }


        }
//        if (start ==0 && count>0) {
//            redText.setText("Red-" + redScore);
//            yellowText.setText("Yellow-" + yellowScore);
//            Toast.makeText(this, "The Game was Draw!", Toast.LENGTH_SHORT).show();
//        }
        if (start == 0) {
            Toast.makeText(this, "Press Start to begin the game! ", Toast.LENGTH_SHORT).show();
        }
    }





    public void Start(View view) {
        redText = (TextView) findViewById(R.id.redView);
        yellowText = (TextView) findViewById(R.id.yellowView);
        Toast.makeText(getApplicationContext(), "The Game has started!", Toast.LENGTH_SHORT).show();
        gameGoingOn = 1;
        start = 1; // countDown interval is 1000 which shows that the timer ticks down by  second each(1000 milliseconds)
        waitTimer = new CountDownTimer(currentTime*1000,50) {
            @Override
            public void onTick(long millisUntilFinished) {
                currentState = 1;
                Log.i("Time ticking", String.valueOf(millisUntilFinished / 1000));
                if (start == 1 && winner == "Red") {
//                    redPoints = 1;
//                    yellowPoints = 0;
//                    redScore += redPoints;
//                    yellowScore += yellowPoints;
//                    redText.setText("Red-" + redScore);
//                    yellowText.setText("Yellow-" + yellowScore);
//                    Toast.makeText(getApplicationContext(), winner+" has won the game!", Toast.LENGTH_SHORT).show();

                    if (waitTimer != null) {
                        waitTimer.cancel();
                        waitTimer = null;
                    }


                }
                if (start == 1 && winner == "Yellow") {
//                    redPoints = 0;
//                    yellowPoints = 1;
//                    redScore += redPoints;
//                    yellowScore += yellowPoints;
//                    redText.setText("Red-" + redScore);
//                    yellowText.setText("Yellow-" + yellowScore);
//                    Toast.makeText(getApplicationContext(), winner+" has won the game!", Toast.LENGTH_SHORT).show();

                    if (waitTimer != null) {
                        waitTimer.cancel();
                        waitTimer = null;
                    }


                }
                if (start == 1 && winner == "Draw") {
//                    redPoints = 0;
//                    yellowPoints = 1;
//                    redScore += redPoints;
//                    yellowScore += yellowPoints;
//                    redText.setText("Red-" + redScore);
//                    yellowText.setText("Yellow-" + yellowScore);
//                    Toast.makeText(getApplicationContext(), winner+" has won the game!", Toast.LENGTH_SHORT).show();
                    if (waitTimer != null) {
                        waitTimer.cancel();
                        waitTimer = null;
                    }

                }
            }

            @Override
            public void onFinish() {
                start = 0;
                currentState=0;
                gameGoingOn = 0;
                if (start == 0 && gameGoingOn==0) {
                    redPoints = 0.5;
                    yellowPoints = 0.5;
                    redScore += redPoints;
                    yellowScore += yellowPoints;
                    gameActive = false;
                    redText.setText("Red-" + redScore);
                    yellowText.setText("Yellow-" + yellowScore);
                    Toast.makeText(getApplicationContext(), "The Game was Draw!Click Play Again to continue the battle!", Toast.LENGTH_SHORT).show();

                }


            }

        }.start();
    }








    public void goHome(View view) {
//        Button playAgainButton = (Button) findViewById(R.id.button);
//        playAgainButton.setVisibility(View.INVISIBLE);
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
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

    public void playAgain(View view) {
        Button playAgainButton = (Button) findViewById(R.id.button);
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
        start = 0;
        currentTime = 15;
        currentState = 0;
        message = "";
        winner = "";



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen_second);
    }
}