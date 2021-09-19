package com.cal109.pomodoroapp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTimeCounterTest {
    WorkTimeCounter workTimeCounter = new WorkTimeCounter();
    String textViewVariable;

    @Test
    public void WorkTimeCountDown_Started_SetBackgroundRed(){
        assertEquals("Red", workTimeCounter.setBackgroundColor());
    }

    @Test
    public void OnCountdownStart_SetMainTextviewStringToContainStop(){
        textViewVariable = workTimeCounter.setTextviewStringToStop();
        assertEquals("Stop", textViewVariable);
    }

    @Test
    public void OnCountdownStart_SetMainTextviewStringToContainStart(){
        textViewVariable = workTimeCounter.setTextviewStringToStart();
        assertEquals("Start", textViewVariable);
    }

}
