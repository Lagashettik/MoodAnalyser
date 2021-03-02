public class MoodAnalyzer extends Throwable{
    String message;

    MoodAnalyzer(){}

    MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try{

            if (this.message.contains("SAD") || this.message.contains("Sad") || this.message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException  e){
            return "HAPPY";
        }
    }
}
