interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment by Credit Card");
    }
}

public class Exp65_PaymentInterface {

    public static void main(String[] args) {

        Payment p = new CreditCard();
        p.pay();
    }
}