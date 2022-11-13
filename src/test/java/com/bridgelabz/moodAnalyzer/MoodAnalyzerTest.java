package com.bridgelabz.moodAnalyzer;

import org.junit.jupiter.api.*;


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
    public void givenMessage_WhenSad_ShouldReturn_Sad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Sad Message");
        String mood1 = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD",mood1);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Message");
        String mood2 = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY",mood2);
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood3 = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY",mood3);
    }

}
