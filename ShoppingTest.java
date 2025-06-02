class Shopping {
    void buy() {
        System.out.println("Buying a product from the store.");
    }
}

class OnlineShopping extends Shopping {
    @Override
    void buy() {
        System.out.println("Buying a product from the online store.");
    }
}

public class ShoppingTest {
    public static void main(String[] args) {
        Shopping s1 = new Shopping();
        s1.buy();  

        Shopping s2 = new OnlineShopping();
        s2.buy(); 
    }
}
