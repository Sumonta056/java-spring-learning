package basics.OOP.Abstraction;

public class Paypal extends PaymentProcess implements OnlinePayment {
    public Paypal(String transactionId) {
        super(transactionId);
    }

    @Override
    public boolean authorize(double amount) {
        System.out.println("PayPal: Authorizing $" + amount);
        return amount < 5000; // Simulate limit
    }

    @Override
    public boolean capture(double amount) {
        System.out.println("PayPal: Capturing $" + amount);
        return true;
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("PayPal: Refunding $" + amount);
        return true;
    }
}
