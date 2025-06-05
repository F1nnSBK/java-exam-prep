package maps_02;

public class DuplicateKeyException extends Exception {
    String messsage;

    public DuplicateKeyException(String message) {
        super(message);
    }

        public DuplicateKeyException() {
        super();
    }
}
