package DAY16.ExceptionHandling;
class OutOfStockException extends Exception{
    OutOfStockException(String message){
        super(message);
    }
}

class Product{
    private int quantity = 100;
    void buy(int noProduct) throws OutOfStockException{
        if(noProduct>quantity){
            throw new OutOfStockException("Out of stock");
        }else {
            quantity-=noProduct;
        }
    }
}
public class PR3 {
    public static void main(String[] args) {
        Product obj = new Product();
        try{
            obj.buy(120);
        }catch (OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}
