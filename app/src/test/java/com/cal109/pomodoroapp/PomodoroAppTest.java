package com.cal109.pomodoroapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PomodoroAppTest {
    @Test
    public void playSoundWhenWorkTimeIsOver(){
        PomodoroApp pomodoroApp = new PomodoroApp();
        assertTrue(pomodoroApp.workTimeIsUp(true));
        int timeRemaining = 0;
        assertTrue(pomodoroApp.workTimeUpSoundHasPlayed(timeRemaining));
    }

}
