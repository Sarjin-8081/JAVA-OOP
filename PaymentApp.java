public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new PayPal();
        PaymentMethod bankTransfer = new BankTransfer();

        creditCard.processPayment();
        paypal.processPayment();
        bankTransfer.processPayment();
    }
}

abstract class PaymentMethod {
    abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPal extends PaymentMethod {
    void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

class BankTransfer extends PaymentMethod {
    void processPayment() {
        System.out.println("Processing bank transfer payment...");
    }
}
