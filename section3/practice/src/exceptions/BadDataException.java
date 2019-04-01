package exceptions;

import java.io.IOException;
import java.util.Random;
/**
 * BadDataException
 */
public class BadDataException extends IOException {
    static final Long serialVersionID = (new Random()).nextLong();
    public BadDataException() { super(); }

    public BadDataException(String message) {
        super(message);
    }
    
}