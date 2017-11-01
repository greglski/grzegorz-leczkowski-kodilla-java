package com.kodilla.patterns.singleton;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoggerTestSuite {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    @Test
    public void testLog() {
        //Given
        //When
        //Logger logger = new Logger();
        Logger.getInstance().log("Operation unfinished");
        //Then
        Assert.assertEquals("Log: [Operation unfinished]\r\n", outputStream.toString());
    }

    @Test
    public void testGetLastLog() {
        //Given
        //Logger logger = new Logger();
        Logger.getInstance().log("Operation finished");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Operation finished", lastLog);
    }
}
