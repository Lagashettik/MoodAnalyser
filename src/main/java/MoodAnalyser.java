public class MoodAnalyser extends Throwable{
    String message;

    MoodAnalyser(){}

    MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try{
            if(message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Enter correct mood");

            if (this.message.contains("SAD") || this.message.contains("Sad") || this.message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
