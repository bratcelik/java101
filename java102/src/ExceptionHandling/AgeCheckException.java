package ExceptionHandling;

public class AgeCheckException extends Exception {
    public AgeCheckException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "This error belongs to class " + this.getClass().getSimpleName();
    }
}
