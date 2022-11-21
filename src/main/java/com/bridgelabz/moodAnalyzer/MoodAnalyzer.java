package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {

    private String messege;
    public MoodAnalyzer(String message) {
        this.messege = message;
    }
    public MoodAnalyzer() {
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (messege.length() == 0){
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.ENTERED_EMPTY, "Please enter Proper Mood");

        }
        if (messege.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.ENTERED_NULL, "Please enter Proper Mood");
        }
    }
}
