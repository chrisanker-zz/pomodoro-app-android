package com.cal109.pomodoroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView timerDisplay;
    private boolean timerStarted = false;
    private static final int minutesDenominator = 60000;
    private static final int secondsDenominator = 1000;
    private static final int modulusValue = 60;
    private long minutes;
    private long seconds;

    WorkTimeCounter workTimeCounter = new WorkTimeCounter();



    CountDownTimer workCountDown = new CountDownTimer(1501000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            minutes = (millisUntilFinished / minutesDenominator) % modulusValue;
            seconds = (millisUntilFinished / secondsDenominator) % modulusValue;
            displayRemainingTime();
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
            displayRemainingTime();
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

        Button mainButton = findViewById(R.id.main_button);
        timerDisplay = findViewById(R.id.time_remaining_text);
        TextView mainTextView = findViewById(R.id.textView);

        mainButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String buttonText;
        String mainTextVariable;
        if (!timerStarted){
            timerStarted = true;
            workCountDown.start();
            buttonText = "Stop";
            ((TextView)findViewById (R.id.main_button)).setText(buttonText);
            mainTextVariable = WorkTimeCounter.setTextViewStringVariable(timerStarted);
            ((TextView)findViewById (R.id.textView)).setText(mainTextVariable);
        }
        else{
            timerStarted = false;
            workCountDown.cancel();
            breakCountDown.cancel();
            buttonText = "Start";
            ((TextView)findViewById (R.id.main_button)).setText(buttonText);
            mainTextVariable = WorkTimeCounter.setTextViewStringVariable(timerStarted);
            ((TextView)findViewById (R.id.textView)).setText(mainTextVariable);
        }

    }

    void displayRemainingTime(){
        {
            String secondsString = String.format("%02d", seconds);
            String minutesString = String.format("%02d", minutes);
            timerDisplay.setText(minutesString + ":" + secondsString);
        }
    }
}