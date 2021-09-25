package com.example.connect3game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    TextView textView0 = (TextView) findViewById(R.id.textView0);
    TextView textView1 = (TextView) findViewById(R.id.textView1);
    TextView textView2 = (TextView) findViewById(R.id.textView2);
    TextView textView3 = (TextView) findViewById(R.id.textView3);
    TextView textView4 = (TextView) findViewById(R.id.textView4);
    TextView textView5 = (TextView) findViewById(R.id.textView5);
    TextView textView6 = (TextView) findViewById(R.id.textView6);
    TextView textView7 = (TextView) findViewById(R.id.textView7);
    TextView textView8 = (TextView) findViewById(R.id.textView8);
    TextView textView9 = (TextView) findViewById(R.id.textView9);
    TextView textView10 = (TextView) findViewById(R.id.textView10);
    TextView textView11 = (TextView) findViewById(R.id.textView11);
    TextView textView12 = (TextView) findViewById(R.id.textView12);
    TextView textView13 = (TextView) findViewById(R.id.textView13);
    public void home(View view) {
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }
    public void playAgain(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        double redPoints = intent.getDoubleExtra("redPoints",-1);
        double yellowPoints = intent.getDoubleExtra("yellowPoints",-1);
        Log.i("redValue",String.valueOf(redPoints));
        Log.i("yellowValue",String.valueOf(yellowPoints));

    }
}