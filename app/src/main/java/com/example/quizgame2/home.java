package com.example.quizgame2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        View movieBtn = findViewById(R.id.moviebtn);
        View gamebtn = findViewById(R.id.gamebtn);
        View tvbtn = findViewById(R.id.tvbtn);

        movieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, moviequiz.class);
                startActivity(intent);
            }
        });

        gamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, gamequiz.class);
                startActivity(intent);
            }
        });

        tvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, tvquiz.class);
                startActivity(intent);
            }
        });
    }
}