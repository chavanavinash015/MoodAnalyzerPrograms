package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {

    public String messege;
    public MoodAnalyzer(String message) {
        this.messege = message;
    }
    public String analyzeMood() {
        if(messege.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
