package co.com.demowebshop.exceptions;

public class TextDontMatch extends AssertionError{
    public static final String VALIDATION_DO_NOT_MATCH = "las validaciones no concuerdan. %s";

    public TextDontMatch(String message, Throwable cause){
        super(message, cause);
    }
}
