package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {

    public String messege;
    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message) {
        this.messege = message;
    }
    public String analyzeMood() {
        try {
            if (messege.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
