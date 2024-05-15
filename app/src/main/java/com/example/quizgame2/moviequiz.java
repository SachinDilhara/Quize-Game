package com.example.quizgame2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class moviequiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_moviequiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        View harryPotterLayout = findViewById(R.id.harrypotter);
        View mcuLayout = findViewById(R.id.mcu);
        View twilight = findViewById(R.id.twilight);
        View miLayout = findViewById(R.id.missionimpossible);
        View pocLayout = findViewById(R.id.piratesofthecaribbean);
        View dk = findViewById(R.id.darkknight);
        View lor = findViewById(R.id.lordoftherings);
        View uw = findViewById(R.id.underworld);
        View ff = findViewById(R.id.fastandfurious);
        View jw = findViewById(R.id.johnwick);


        harryPotterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Dashboardactivity
                Intent intent = new Intent(moviequiz.this, Dashboardactivity.class);
                startActivity(intent);
            }
        });

        twilight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, twilight.class);
                startActivity(intent);
            }
        });

        mcuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, mcu.class);
                startActivity(intent);
            }
        });

        miLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, mi.class);
                startActivity(intent);
            }
        });

        pocLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, poc.class);
                startActivity(intent);
            }
        });

        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, dk.class);
                startActivity(intent);
            }
        });

        lor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, lor.class);
                startActivity(intent);
            }
        });

        uw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, uw.class);
                startActivity(intent);
            }
        });

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, ff.class);
                startActivity(intent);
            }
        });

        jw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moviequiz.this, jw.class);
                startActivity(intent);
            }
        });
    }
}
