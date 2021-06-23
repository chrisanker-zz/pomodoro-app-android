package com.cal109.pomodoroapp;

public class PomodoroTimer {
    private boolean isStarted;

    public boolean Start() {
        if(isStarted){
            isStarted = false;
        }
        else{
            isStarted = true;
        }
        return isStarted;
    }

}
