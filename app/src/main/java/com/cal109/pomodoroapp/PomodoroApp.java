package com.cal109.pomodoroapp;

public class PomodoroApp {

    private boolean workTimeIsUp;

    public boolean workTimeIsUp(boolean b){
        workTimeIsUp = b;
        return workTimeIsUp;
    }

    public boolean workTimeUpSoundHasPlayed(int i) {
        if (i == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
