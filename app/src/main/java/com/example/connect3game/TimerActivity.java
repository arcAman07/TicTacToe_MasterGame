package com.example.connect3game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TimerActivity extends AppCompatActivity {
    public void tenSecond(View view) {
        Intent intent = new Intent(getApplicationContext(),TenSecondActivity.class);
        startActivity(intent);
    }
    public void fifteenSecond(View view) {
        Intent intent = new Intent(getApplicationContext(),FifteenSecondActivity.class);
        startActivity(intent);
    }
    public void twentySecond(View view) {
        Intent intent = new Intent(getApplicationContext(),TwentySecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }
}