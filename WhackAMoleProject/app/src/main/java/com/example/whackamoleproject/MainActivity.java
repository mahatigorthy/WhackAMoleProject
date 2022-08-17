package com.example.whackamoleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.startGameButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callSecondActivity(view);
            }
        });

    }

    public void callSecondActivity(View view)
    {
        Intent intentToLoad = new Intent(MainActivity.this, Game.class);
        startActivity(intentToLoad);
    }
}