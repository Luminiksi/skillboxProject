package exceptions.lessons;

public class IncorrectFileException extends RuntimeException {
    public IncorrectFileException() {
    }

    public IncorrectFileException(String message) {
        super(message);
    }
}
