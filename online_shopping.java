// Base class
class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}


interface OrderProcessing {
    void placeOrder();
    void cancelOrder();
}


interface Payment {
    void processPayment();
    void refund();
}


public class online_shopping extends Product implements OrderProcessing, Payment {

    public online_shopping(String productName, double price) {
        super(productName, price);
    }

    // OrderProcessing methods
    public void placeOrder() {
        System.out.println("Order placed for: " + productName);
    }

    public void cancelOrder() {
        System.out.println("Order cancelled for: " + productName);
    }

      
    public void processPayment() {
        System.out.println("Payment processed: " + price);
    }

    public void refund() {
        System.out.println("Refund issued for: " + productName);
    }

    public static void main(String[] args) {
        online_shopping item = new online_shopping("Laptop", 50000);
        item.placeOrder();
        item.processPayment();
        item.cancelOrder();
        item.refund();
    }
}