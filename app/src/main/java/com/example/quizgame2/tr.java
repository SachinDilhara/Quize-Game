package com.example.quizgame2;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.progressindicator.LinearProgressIndicator;

import java.util.Collections;
import java.util.List;

public class tr extends AppCompatActivity {

    CountDownTimer countDownTimer;
    int timerValue = 20;
    LinearProgressIndicator progressBar;
    List<ModelClass> allQuestionsList;
    ModelClass modelClass;
    int index = 0;
    TextView card_question, card_opriona, card_oprionb, card_oprionc, card_opriond;
    int correctcount = 0;
    int wrongcount = 0;
    LinearLayout nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboardactivity);

        Hooks();

        allQuestionsList = MainActivity.tr;
        Collections.shuffle(allQuestionsList);
        modelClass = MainActivity.tr.get(index);

        setAllData();
        initializeQuiz();
    }

    private void initializeQuiz() {
        startTimer();
        enableButtons();
    }

    private void startTimer() {
        progressBar = findViewById(R.id.quiztimer);
        countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerValue -= 2;
                progressBar.setProgress(timerValue);
            }

            @Override
            public void onFinish() {
                showTimeOutDialog();
            }
        }.start();
    }

    private void setAllData() {
        resetColors();
        card_question.setText(modelClass.getQuestion());
        card_opriona.setText(modelClass.getOp1());
        card_oprionb.setText(modelClass.getOp2());
        card_oprionc.setText(modelClass.getOp3());
        card_opriond.setText(modelClass.getOp4());
    }

    private void Hooks() {
        progressBar = findViewById(R.id.quiztimer);
        card_question = findViewById(R.id.card_question);
        card_opriona = findViewById(R.id.card_opriona);
        card_oprionb = findViewById(R.id.card_oprionb);
        card_oprionc = findViewById(R.id.card_oprionc);
        card_opriond = findViewById(R.id.card_opriond);

        nextbtn = findViewById(R.id.nextbtn);

        card_opriona.setOnClickListener(this::optionaclick);
        card_oprionb.setOnClickListener(this::optionbclick);
        card_oprionc.setOnClickListener(this::optioncclick);
        card_opriond.setOnClickListener(this::optiondclick);
    }

    public void wrong() {
        wrongcount++;
        if (index < MainActivity.tr.size() - 1) {
            index++;
            modelClass = MainActivity.tr.get(index);
            setAllData();
        } else {
            gamewon();
        }
    }

    private void gamewon() {
        Intent intent = new Intent(tr.this, wonActivity.class);
        intent.putExtra("correctCount", correctcount);
        intent.putExtra("wrongCount", wrongcount);
        startActivity(intent);
    }

    public void optionaclick(View view) {
        if (modelClass.getOp1().equals(modelClass.getAns())) {
            card_opriona.setBackgroundColor(getResources().getColor(R.color.right));
            correctcount++;
        } else {
            card_opriona.setBackgroundColor(getResources().getColor(R.color.Third));
            wrongcount++;
            showCorrectAnswer();
        }
        enableNextButton();
        disableButtons();
    }

    public void optionbclick(View view) {
        if (modelClass.getOp2().equals(modelClass.getAns())) {
            card_oprionb.setBackgroundColor(getResources().getColor(R.color.right));
            correctcount++;
        } else {
            card_oprionb.setBackgroundColor(getResources().getColor(R.color.Third));
            wrongcount++;
            showCorrectAnswer();
        }
        enableNextButton();
        disableButtons();
    }

    public void optioncclick(View view) {
        if (modelClass.getOp3().equals(modelClass.getAns())) {
            card_oprionc.setBackgroundColor(getResources().getColor(R.color.right));
            correctcount++;
        } else {
            card_oprionc.setBackgroundColor(getResources().getColor(R.color.Third));
            wrongcount++;
            showCorrectAnswer();
        }
        enableNextButton();
        disableButtons();
    }

    public void optiondclick(View view) {
        if (modelClass.getOp4().equals(modelClass.getAns())) {
            card_opriond.setBackgroundColor(getResources().getColor(R.color.right));
            correctcount++;
        } else {
            card_opriond.setBackgroundColor(getResources().getColor(R.color.Third));
            wrongcount++;
            showCorrectAnswer();
        }
        enableNextButton();
        disableButtons();
    }

    private void disableButtons() {
        card_opriona.setClickable(false);
        card_oprionb.setClickable(false);
        card_oprionc.setClickable(false);
        card_opriond.setClickable(false);
    }

    private void showCorrectAnswer() {
        if (modelClass.getAns().equals(modelClass.getOp1())) {
            card_opriona.setBackgroundColor(getResources().getColor(R.color.right));
        } else if (modelClass.getAns().equals(modelClass.getOp2())) {
            card_oprionb.setBackgroundColor(getResources().getColor(R.color.right));
        } else if (modelClass.getAns().equals(modelClass.getOp3())) {
            card_oprionc.setBackgroundColor(getResources().getColor(R.color.right));
        } else if (modelClass.getAns().equals(modelClass.getOp4())) {
            card_opriond.setBackgroundColor(getResources().getColor(R.color.right));
        }
    }

    public void nextbtnClick(View view) {
        if (((ColorDrawable) card_opriona.getBackground()).getColor() == getResources().getColor(R.color.white) &&
                ((ColorDrawable) card_oprionb.getBackground()).getColor() == getResources().getColor(R.color.white) &&
                ((ColorDrawable) card_oprionc.getBackground()).getColor() == getResources().getColor(R.color.white) &&
                ((ColorDrawable) card_opriond.getBackground()).getColor() == getResources().getColor(R.color.white)) {
            Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
            return;
        }

        index++;
        if (index < MainActivity.tr.size()) {
            modelClass = MainActivity.tr.get(index);
            setAllData();
            resetColors();
            enableButtons();
            resetTimer();
        } else {
            gamewon();
            disableNextButton();
        }
    }

    private void resetTimer() {
        countDownTimer.cancel();
        timerValue = 20;
        progressBar.setProgress(20);
        startTimer();
    }

    private void enableButtons() {
        card_opriona.setClickable(true);
        card_oprionb.setClickable(true);
        card_oprionc.setClickable(true);
        card_opriond.setClickable(true);
    }

    private void enableNextButton() {
        nextbtn.setEnabled(true);
    }

    private void disableNextButton() {
        nextbtn.setEnabled(false);
    }

    private void resetColors() {
        card_opriona.setBackgroundColor(getResources().getColor(R.color.white));
        card_oprionb.setBackgroundColor(getResources().getColor(R.color.white));
        card_oprionc.setBackgroundColor(getResources().getColor(R.color.white));
        card_opriond.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void showTimeOutDialog() {
        Dialog dialog = new Dialog(this);
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        dialog.setContentView(R.layout.time_out_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.findViewById(R.id.btnTryAgain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tr.this, home.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
