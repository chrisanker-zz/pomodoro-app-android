package com.cal109.pomodoroapp;

public class WorkTimeCounter {
    private String backgroundColor;

    public static String setTextViewStringVariable(boolean isCountingDown) {
        if (!isCountingDown){
            return "start";
        }
        else{
            return "stop";
        }
    }

    public String setBackgroundColor() {
        backgroundColor = "Red";
        return backgroundColor;
    }

    public String setTextviewStringToStop() {
        return "stop";
    }

    public String setTextviewStringToStart() {
        return "start";
    }
}
