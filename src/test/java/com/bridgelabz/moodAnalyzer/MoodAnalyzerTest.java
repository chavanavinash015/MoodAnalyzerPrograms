package com.bridgelabz.moodAnalyzer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {

    @AfterAll
    static void displayMethod(){
        System.out.println("Welcome to the Mood Analyzer program");
    }
    @AfterEach
    public void afterDisplayMethod(){
        System.out.println("test is passed");
    }
     @Test
     void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad Message");
        String mood1 = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD",mood1);

    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Messgae");
        String mood2 = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY",mood2);
    }
}
