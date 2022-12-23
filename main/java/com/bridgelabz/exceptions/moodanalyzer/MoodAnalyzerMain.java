package com.bridgelabz.exceptions.moodanalyzer;

public class MoodAnalyzerMain {
    public String analyseMood(String message) {

        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
