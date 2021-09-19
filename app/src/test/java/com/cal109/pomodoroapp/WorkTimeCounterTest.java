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
        assertEquals("stop", textViewVariable);
    }

    @Test
    public void OnCountdownStop_SetMainTextviewStringToContainStart(){
        textViewVariable = workTimeCounter.setTextviewStringToStart();
        assertEquals("start", textViewVariable);
    }

    @Test
    public void SetMainTextViewStringVariable_BasedOnCountDownStatus(){
        boolean isCountingDown = false;
        String textViewVariable = WorkTimeCounter.setTextViewStringVariable(isCountingDown);
        assertEquals("start", textViewVariable);
    }

}
