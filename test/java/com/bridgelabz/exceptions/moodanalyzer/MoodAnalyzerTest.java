package com.bridgelabz.exceptions.moodanalyzer;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() throws MoodAnalysisException {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("This is a sad message");//Tc1.1 Refactor
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() throws MoodAnalysisException {//Tc1.2 Refactor
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood1,"HAPPY");
    }
}