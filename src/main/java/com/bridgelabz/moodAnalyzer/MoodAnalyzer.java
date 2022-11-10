package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {

    private  String messege;
    public MoodAnalyzer(String message) {
        this.messege = message;
    }
    public String analyzeMood() {
        if(messege.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
