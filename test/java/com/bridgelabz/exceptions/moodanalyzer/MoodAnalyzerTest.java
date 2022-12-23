package com.bridgelabz.exceptions.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis_whenMoodIsSad() { //TC 1.1 "I am in sad mood"
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood( "I am in sad mood ");
        Assert.assertEquals(mood, "SAD");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsHappy() { //TC 1.2 I am in happy mood
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood1 = moodAnalyzer.analyseMood("I am in happy mood");
        Assert.assertEquals(mood1, "HAPPY");
    }
}