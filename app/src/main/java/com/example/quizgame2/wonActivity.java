package com.example.quizgame2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class wonActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    int correctCount;
    int wrongCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);

        sharedPreferences = getSharedPreferences("QuizCounts", Context.MODE_PRIVATE);
        correctCount = getIntent().getIntExtra("correctCount", 0);
        wrongCount = getIntent().getIntExtra("wrongCount", 0);

        TextView correctTextView = findViewById(R.id.correct);
        TextView wrongTextView = findViewById(R.id.incorrect);

        correctTextView.setText(correctCount + " Correct!");
        wrongTextView.setText(wrongCount + " Wrong!");

        Button exploreButton = findViewById(R.id.explorebtn);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wonActivity.this, home.class);
                startActivity(intent);
            }
        });
    }

    public void incrementCorrectCount() {
        correctCount++;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("correctCount", correctCount);
        editor.apply();
    }

    public void incrementWrongCount() {
        wrongCount++;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("wrongCount", wrongCount);
        editor.apply();
    }
}
