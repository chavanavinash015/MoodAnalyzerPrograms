package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzer {

    public String messege;
    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message) {
        this.messege = message;
        analyzeMood();
    }public String getMessege(){
        return messege;
    }
    public void setMessege(String messege){
        this.messege = messege;
    }
    public String analyzeMood() {
        try {
            if (messege.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }
}
