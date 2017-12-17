package exception;

public class BasketNotFoundException extends Exception {

    public BasketNotFoundException(){
        super();
    }

    public BasketNotFoundException(String message){
        super(message);
    }
}

