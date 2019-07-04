package com.example.androidjokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();
        if (intent != null) {
            String joke = intent.getStringExtra("jokeKey");
            TextView textView = findViewById(R.id.joke_textView);
            textView.setText(joke);
        }

    }
}
