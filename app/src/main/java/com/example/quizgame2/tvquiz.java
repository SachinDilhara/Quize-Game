package com.example.quizgame2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class tvquiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tvquiz);

        View vdLayout  = findViewById(R.id.vampirediaries);
        View tfLayout  = findViewById(R.id.teenwolf);
        View gotLayout  = findViewById(R.id.gameofthrones);
        View bbLayout  = findViewById(R.id.breakingbad);
        View vikingLayout  = findViewById(R.id.viking);


        vdLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tvquiz.this, vd.class);
                startActivity(intent);
            }
        });

        tfLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tvquiz.this, tw.class);
                startActivity(intent);
            }
        });

        gotLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tvquiz.this, got.class);
                startActivity(intent);
            }
        });

        bbLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tvquiz.this, bb.class);
                startActivity(intent);
            }
        });

       vikingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tvquiz.this, viking.class);
                startActivity(intent);
            }
        });

    }
}