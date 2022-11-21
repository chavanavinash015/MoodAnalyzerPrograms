package com.bridgelabz.moodAnalyzer;

public class MoodAnalyzerException extends Exception {
    public Exception type;

    public MoodAnalyzerException (Exception type, String message) {
        super(message);
        this.type = type;
    }


    public enum exceptionType{
        EXCEPTION_TYPE, EXCEPTION_NULL;
        public static final Exception ENTERED_EMPTY = null;
        public static final Exception ENTERED_NULL = null ;
    }
}
