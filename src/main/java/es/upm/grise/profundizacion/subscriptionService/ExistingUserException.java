package es.upm.grise.profundizacion.subscriptionService;

public class ExistingUserException extends Exception {
    public ExistingUserException(String message) {
        super(message);
    }
}
