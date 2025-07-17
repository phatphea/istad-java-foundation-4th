package exceptionhandling;

public class ScoreFormatException extends RuntimeException {

    public ScoreFormatException(){
        super();
    }

    public ScoreFormatException(String message) {
        super(message);
    }
}
