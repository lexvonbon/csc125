package exceptions;
/**
 * InsufficientFundsException
 */
public class InsufficientFundsException extends IllegalArgumentException {
    static final long serialVersionUID = 123;
    public InsufficientFundsException(String message) {
        super(message);
    }
}