package com.example.quizgame2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class mcuquestion extends AppCompatActivity {

    public static ArrayList<ModelClass> listofq;


    DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listofq = new ArrayList<>();
        listofq.add(new ModelClass("What house is Harry Potter sorted into at Hogwarts?", "Hufflepuff", "Ravenclaw", "Gryffindor", "Slytherin", "Gryffindor"));
        listofq.add(new ModelClass("What position does Harry play on his Quidditch team?", "Beater", "Keeper", "Chaser", "Seeker", "Seeker"));
        listofq.add(new ModelClass("What is the name of Harry Potter's pet owl?", "Crookshanks", "Hedwig", "Scabbers", "Fawkes", "Hedwig"));
        listofq.add(new ModelClass("Who is the Half-Blood Prince?", "Albus Dumbledore", "Sirius Black", "Severus Snape", "Tom Riddle", "Severus Snape"));
        listofq.add(new ModelClass("What spell is used to disarm an opponent?", "Avada Kedavra", "Expelliarmus", "Crucio", "Accio", "Expelliarmus"));
        listofq.add(new ModelClass("Who is the headmaster of Hogwarts for most of the series?", "Minerva McGonagall", "Severus Snape", "Dolores Umbridge", "Albus Dumbledore", "Albus Dumbledore"));
        listofq.add(new ModelClass("What magical creature is Aragog?", "Basilisk", "Hippogriff", "Acromantula", "Thestral", "Acromantula"));
        listofq.add(new ModelClass("What is the name of the Weasley family home?", "The Burrow", "Grimmauld Place", "Malfoy Manor", "Shell Cottage", "The Burrow"));
        listofq.add(new ModelClass("Which of the following is not a Horcrux?", "Harry Potter", "Nagini", "Godric Gryffindor's sword", "Helga Hufflepuff's cup", "Godric Gryffindor's sword"));
        listofq.add(new ModelClass("What is the name of the potion that grants good luck?", "Amortentia", "Felix Felicis", "Polyjuice Potion", "Veritaserum", "Felix Felicis"));
        listofq.add(new ModelClass("Who kills Dobby the house-elf?", "Bellatrix Lestrange", "Lucius Malfoy", "Fenrir Greyback", "Draco Malfoy", "Bellatrix Lestrange"));
        listofq.add(new ModelClass("What form does Hermione Granger's Patronus take?", "Stag", "Otter", "Doe", "Phoenix", "Otter"));
        listofq.add(new ModelClass("Who is the author of 'A History of Magic'?", "Bathilda Bagshot", "Newt Scamander", "Rita Skeeter", "Gilderoy Lockhart", "Bathilda Bagshot"));
        listofq.add(new ModelClass("Which Hogwarts professor is a ghost?", "Professor Sprout", "Professor Binns", "Professor Flitwick", "Professor Trelawney", "Professor Binns"));
        listofq.add(new ModelClass("What is the name of Hagrid's half-brother?", "Aragog", "Norbert", "Grawp", "Buckbeak", "Grawp"));
        listofq.add(new ModelClass("What is the name of Harry's father?", "James Potter", "Remus Lupin", "Sirius Black", "Peter Pettigrew", "James Potter"));
        listofq.add(new ModelClass("What is the name of the dark wizard who killed Harry's parents?", "Voldemort", "Lucius Malfoy", "Bellatrix Lestrange", "Severus Snape", "Voldemort"));
        listofq.add(new ModelClass("Which magical creature guards the entrance to Gryffindor Tower?", "The Fat Lady", "The Bloody Baron", "The Grey Lady", "Nearly Headless Nick", "The Fat Lady"));
        listofq.add(new ModelClass("What is the name of the Triwizard Tournament's dragon task?", "Hungarian Horntail", "Swedish Short-Snout", "Chinese Fireball", "Common Welsh Green", "Hungarian Horntail"));
        listofq.add(new ModelClass("Who is known as the 'Master of Death'?", "Albus Dumbledore", "Sirius Black", "Harry Potter", "Tom Riddle", "Harry Potter"));






        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(mcuquestion.this, home.class);
                startActivity(intent);

            }
        },1500);

    }
}