public class MoodAnalyzer {
    String message;
    MoodAnalyzer(){}
    MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyseMood(){
        return "SAD";
    }

    public String analyseMood(String message) {
        this.message = message;
            if (this.message.contains("SAD") || this.message.contains("Sad") || this.message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
    }
}
