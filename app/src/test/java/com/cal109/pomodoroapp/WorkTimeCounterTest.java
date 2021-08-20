package com.cal109.pomodoroapp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTimeCounterTest {
    @Test
    public void WorkTimeCountDown_Started_SetBackgroundRed(){
        WorkTimeCounter workTimeCounter = new WorkTimeCounter();
        boolean b = false;
        assertEquals("Red", workTimeCounter.setBackgroundColor(b));
    }

}
