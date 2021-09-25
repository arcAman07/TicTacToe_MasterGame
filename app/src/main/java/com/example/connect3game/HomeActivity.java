package com.example.connect3game;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    public void againstHuman(View view) {
        Button homeButton = (Button) findViewById(R.id.humanButton);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    public void againstEngine(View view) {
        Button engineButton = (Button) findViewById(R.id.engineButton);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent); // UnderDevelopment(initially randomly) but then played stored in a DB and ML model built on this
    }
    public void customMode(View view) {
        Button customMode = (Button) findViewById(R.id.customButton);
        Intent intent = new Intent(getApplicationContext(),TimerActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}