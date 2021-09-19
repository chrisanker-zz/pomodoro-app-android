package com.cal109.pomodoroapp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTimeCounterTest {
    WorkTimeCounter workTimeCounter = new WorkTimeCounter();
    String textViewVariable;
    boolean isCountingDown;

    @Test
    public void WorkTimeCountDown_Started_SetBackgroundRed(){
        assertEquals("Red", workTimeCounter.setBackgroundColor());
    }

    @Test
    public void SetMainTextViewStringVariable_BasedOnCountDownStatus(){
        String textViewVariable = WorkTimeCounter.setTextViewStringVariable(false);
        assertEquals("start", textViewVariable);
        textViewVariable = WorkTimeCounter.setTextViewStringVariable(true);
        assertEquals("stop", textViewVariable);
    }

}
