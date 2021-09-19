package com.cal109.pomodoroapp;

public class WorkTimeCounter {

    public static String setTextViewStringVariable(boolean isCountingDown) {
        if (!isCountingDown){
            return "start";
        }
        else{
            return "stop";
        }
    }

    public String setBackgroundColor() {
        String backgroundColor = "Red";
        return backgroundColor;
    }

}
