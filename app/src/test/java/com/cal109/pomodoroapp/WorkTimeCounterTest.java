package com.cal109.pomodoroapp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTimeCounterTest {
    WorkTimeCounter workTimeCounter = new WorkTimeCounter();

    @Test
    public void WorkTimeCountDown_Started_SetBackgroundRed(){
        boolean b = false;
        assertEquals("Red", workTimeCounter.setBackgroundColor(b));
    }

    @Test
    public void OnCountdownStart_SetMainTextviewStringToContainStop(){
        String textViewVariable = workTimeCounter.setTextviewStringToStop();
        assertEquals("Stop", textViewVariable);
    }

}
