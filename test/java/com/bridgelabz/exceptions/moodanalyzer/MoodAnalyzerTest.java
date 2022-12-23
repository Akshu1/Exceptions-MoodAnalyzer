package com.bridgelabz.exceptions.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("This is a sad message");//Tc1.1 Refactor
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//Tc1.2 Refactor
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood1,"HAPPY");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsNull() { //tc 2.1
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain(null);
        String mood2 = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood2,"HAPPY");
    }
}