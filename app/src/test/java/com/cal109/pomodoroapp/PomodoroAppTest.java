package com.cal109.pomodoroapp;

import android.media.MediaPlayer;
import android.net.rtp.AudioStream;

import org.junit.Test;

import java.io.FileOutputStream;

import static org.junit.Assert.*;

public class PomodoroAppTest {
    @Test
    public void playSoundWhenWorkTimeIsOver(){
        PomodoroApp pomodoroApp = new PomodoroApp();
        assertTrue(pomodoroApp.workTimeUpHasPlayed());
    }
}
