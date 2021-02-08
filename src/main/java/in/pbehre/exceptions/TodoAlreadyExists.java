package in.pbehre.exceptions;

public class TodoAlreadyExists extends RuntimeException {
    public TodoAlreadyExists(String s) {
        super(s);
    }
}
