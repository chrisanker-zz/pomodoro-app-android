package com.cal109.pomodoroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mainButton;
    private TextView timerDisplay;
    private boolean timerStarted = false;
    private static final int minutesDenominator = 60000;
    private static final int secondsDenominator = 1000;
    private static final int modulusValue = 60;
    private long minutes;
    private long seconds;
    String secondsString;
    String minutesString;

    CountDownTimer workCountDown = new CountDownTimer(1500000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            minutes = (millisUntilFinished  / minutesDenominator)% modulusValue;
            seconds = (millisUntilFinished / secondsDenominator) % modulusValue;
            secondsString = String.format("%02d", seconds);
            minutesString = String.format("%02d", minutes);
            timerDisplay.setText("Work time left: " + minutesString + ":" + secondsString);
        }

        @Override
        public void onFinish() {
            workCountDown.cancel();
            breakCountDown.start();
        }
    };

    CountDownTimer breakCountDown = new CountDownTimer(300000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            minutes = (millisUntilFinished / minutesDenominator) % modulusValue;
            seconds = (millisUntilFinished / secondsDenominator) % modulusValue;
            secondsString = String.format("%02d", seconds);
            minutesString = String.format("%02d", minutes);
            timerDisplay.setText("Break time left: " + minutesString + ":" + secondsString);
        }

        @Override
        public void onFinish() {
            breakCountDown.cancel();
            workCountDown.start();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.main_button);
        timerDisplay = findViewById(R.id.textView);


        mainButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (!timerStarted){
            timerStarted = true;
            workCountDown.start();
            mainButton.setText("Stop");
        }
        else{
            timerStarted = false;
            workCountDown.cancel();
            breakCountDown.cancel();
            mainButton.setText("Start");
        }

    }
}