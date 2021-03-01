import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Happy mood");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void testMoodSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Sad mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void testMoodHappyByUsingConstructor(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Today I am Happy");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void testMoodSadByUsingConstructor(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Today I am sad");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
