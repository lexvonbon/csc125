package exceptions;

import java.io.IOException;

/**
 * BadDataException
 */
public class BadDataException extends IOException {
    public BadDataException() {}

    public BadDataException(String message) {
        super(message);
    }
    
}