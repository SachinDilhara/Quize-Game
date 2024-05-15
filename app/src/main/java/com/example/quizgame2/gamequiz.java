package com.example.quizgame2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class gamequiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gamequiz);

        View acLayout  = findViewById(R.id.assassinscreed);
        View mafiaLayout  = findViewById(R.id.mafia);
        View arkhamLayout  = findViewById(R.id.arkham);
        View unchartedLayout  = findViewById(R.id.uncharted);
        View gowLayout  = findViewById(R.id.godofwar);
        View trLayout  = findViewById(R.id.tombraider);
        View fcLayout  = findViewById(R.id.farcry);
        View nfsLayout  = findViewById(R.id.needforspeed);
        View gtaLayout  = findViewById(R.id.gta);
        View codLayout  = findViewById(R.id.callofduty);


        acLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, ac.class);
                startActivity(intent);
            }
        });

        mafiaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, mafia.class);
                startActivity(intent);
            }
        });

        arkhamLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, arkham.class);
                startActivity(intent);
            }
        });

        unchartedLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, uncharted.class);
                startActivity(intent);
            }
        });

        gowLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, gow.class);
                startActivity(intent);
            }
        });

        trLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, tr.class);
                startActivity(intent);
            }
        });

        fcLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, fc.class);
                startActivity(intent);
            }
        });

        nfsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, nfs.class);
                startActivity(intent);
            }
        });

        gtaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, gta.class);
                startActivity(intent);
            }
        });

        codLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gamequiz.this, cod.class);
                startActivity(intent);
            }
        });

    }
}