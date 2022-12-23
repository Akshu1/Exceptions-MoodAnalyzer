package com.bridgelabz.exceptions.moodanalyzer;


public class MoodAnalyzerMain {
    private String message;
    //Default Constructor
    public MoodAnalyzerMain() {
    }
    //Parameterized Constructor
    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    //Handle NULLPOINTER Exception using try-catch block
    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(Exception e) {
            return "HAPPY";
        }
    }
}
