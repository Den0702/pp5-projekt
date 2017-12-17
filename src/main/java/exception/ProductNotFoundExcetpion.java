package exception;

public class ProductNotFoundExcetpion extends Exception {
    public ProductNotFoundExcetpion(){
        super();
    }
    public ProductNotFoundExcetpion(String message)
    {
        super(message);
    }
}
