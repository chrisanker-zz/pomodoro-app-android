package com.cal109.pomodoroapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PomodoroTimerTest {
    PomodoroTimer pomodoroTimer = new PomodoroTimer();

    @Test
    public void pomodoroTimer_isStarted(){
        assertTrue(pomodoroTimer.Start());
    }

}