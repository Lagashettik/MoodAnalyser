import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testnull(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void testMoodHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void testMoodSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

}
