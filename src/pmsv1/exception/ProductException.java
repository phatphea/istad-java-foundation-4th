package pmsv1.exception;

public class ProductException extends RuntimeException {

    public ProductException(){
        super();
    }

    public ProductException(String message) {
        super(message);
    }
}
