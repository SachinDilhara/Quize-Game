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

public class MainActivity extends AppCompatActivity {

    public static ArrayList<ModelClass> listofq;
    public static ArrayList<ModelClass> anotherListOfData;
    public static ArrayList<ModelClass> twilight;
    public static ArrayList<ModelClass> mi;

    public static ArrayList<ModelClass> poc;

    public static ArrayList<ModelClass> ac;

    public static ArrayList<ModelClass> mafia;

    public static ArrayList<ModelClass> arkham;

    public static ArrayList<ModelClass> uncharted;

    public static ArrayList<ModelClass> gow;
    public static ArrayList<ModelClass> vd;
    public static ArrayList<ModelClass> tw;
    public static ArrayList<ModelClass> got;
    public static ArrayList<ModelClass> bb;
    public static ArrayList<ModelClass> viking;

    public static ArrayList<ModelClass> dk;
    public static ArrayList<ModelClass> uw;
    public static ArrayList<ModelClass> ff;
    public static ArrayList<ModelClass> lor;
    public static ArrayList<ModelClass> jw;
    public static ArrayList<ModelClass> tr;
    public static ArrayList<ModelClass> fc;
    public static ArrayList<ModelClass> nfs;
    public static ArrayList<ModelClass> gta;
    public static ArrayList<ModelClass> cod;
    private int nodeCounter = 0;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listofq = new ArrayList<>();
        anotherListOfData = new ArrayList<>();
        twilight = new ArrayList<>();
        mi = new ArrayList<>();
        poc = new ArrayList<>();
        ac = new ArrayList<>();
        mafia = new ArrayList<>();
        arkham = new ArrayList<>();
        uncharted = new ArrayList<>();
        gow = new ArrayList<>();
        vd = new ArrayList<>();
        tw = new ArrayList<>();
        got = new ArrayList<>();
        bb = new ArrayList<>();
        viking = new ArrayList<>();
        dk = new ArrayList<>();
        lor = new ArrayList<>();
        uw = new ArrayList<>();
        ff = new ArrayList<>();
        jw = new ArrayList<>();
        tr = new ArrayList<>();
        nfs = new ArrayList<>();
        fc = new ArrayList<>();
        gta = new ArrayList<>();
        cod = new ArrayList<>();

        databaseReference = FirebaseDatabase.getInstance().getReference("harrypotter");

        // Fetching data from 'harrypotter' node
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    listofq.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // Fetching data from another node, let's assume its 'anotherNode'
        DatabaseReference anotherReference = FirebaseDatabase.getInstance().getReference("mcu");
        anotherReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    anotherListOfData.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // twilight
        DatabaseReference twilightReference = FirebaseDatabase.getInstance().getReference("twilight");
        twilightReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    twilight.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // mi
        DatabaseReference miReference = FirebaseDatabase.getInstance().getReference("mi");
        miReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    mi.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // poc
        DatabaseReference pocReference = FirebaseDatabase.getInstance().getReference("Pirate Of the caribean");
        pocReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    poc.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // ac
        DatabaseReference acReference = FirebaseDatabase.getInstance().getReference("ac");
        acReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    ac.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // mafia
        DatabaseReference mafiaReference = FirebaseDatabase.getInstance().getReference("mafia");
        mafiaReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    mafia.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // arkham
        DatabaseReference arkhamReference = FirebaseDatabase.getInstance().getReference("arkham");
        arkhamReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    arkham.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // uncharted
        DatabaseReference unchartedReference = FirebaseDatabase.getInstance().getReference("uncharted");
        unchartedReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    uncharted.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // god of war
        DatabaseReference gowReference = FirebaseDatabase.getInstance().getReference("gow");
        gowReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    gow.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // vampire diaries
        DatabaseReference vdReference = FirebaseDatabase.getInstance().getReference("vd");
        vdReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    vd.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // teen wolf
        DatabaseReference twReference = FirebaseDatabase.getInstance().getReference("tf");
        twReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    tw.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // game of thrones
        DatabaseReference gotReference = FirebaseDatabase.getInstance().getReference("got");
        gotReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    got.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // breaking bad
        DatabaseReference bbReference = FirebaseDatabase.getInstance().getReference("bb");
        bbReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    bb.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // vikings
        DatabaseReference vikingReference = FirebaseDatabase.getInstance().getReference("vikings");
        vikingReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    viking.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // dark knight
        DatabaseReference dkReference = FirebaseDatabase.getInstance().getReference("dk");
        dkReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    dk.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // lor
        DatabaseReference lorReference = FirebaseDatabase.getInstance().getReference("lor");
        lorReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    lor.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // underworld
        DatabaseReference uwReference = FirebaseDatabase.getInstance().getReference("uw");
        uwReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    uw.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // fast and furious
        DatabaseReference ffReference = FirebaseDatabase.getInstance().getReference("ff");
        ffReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    ff.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // john wick
        DatabaseReference jwReference = FirebaseDatabase.getInstance().getReference("jw");
        jwReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    jw.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // tomb raider
        DatabaseReference trReference = FirebaseDatabase.getInstance().getReference("tr");
        trReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    tr.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // far cry
        DatabaseReference fcReference = FirebaseDatabase.getInstance().getReference("fc");
        fcReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    fc.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // need for speed
        DatabaseReference nfsReference = FirebaseDatabase.getInstance().getReference("nfs");
        nfsReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    nfs.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // gta
        DatabaseReference gtaReference = FirebaseDatabase.getInstance().getReference("gta");
        gtaReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    gta.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // call of duty
        DatabaseReference codReference = FirebaseDatabase.getInstance().getReference("cod");
        codReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    ModelClass modelClass = dataSnapshot.getValue(ModelClass.class);
                    cod.add(modelClass);
                }
                // Start your activity after fetching data
                startNextActivity();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    // Method to start the activity once data is fetched from all nodes
    private void startNextActivity() {
        // Increment the counter every time data is fetched from a node
        nodeCounter++;

        // Check if data is fetched from all nodes
        if (nodeCounter == 4) { // Assuming you have four nodes
            // Start your activity here
            Intent intent = new Intent(MainActivity.this, home.class);
            startActivity(intent);
        }
    }
}
