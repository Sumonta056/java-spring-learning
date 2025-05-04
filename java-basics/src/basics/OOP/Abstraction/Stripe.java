package basics.OOP.Abstraction;

public class Stripe extends PaymentProcess implements OnlinePayment {
    public Stripe(String transactionId) {
        super(transactionId);
    }

    @Override
    public boolean authorize(double amount) {
        System.out.println("Stripe: Authorizing $" + amount);
        return true; // Simulate API call
    }

    @Override
    public boolean capture(double amount) {
        System.out.println("Stripe: Capturing $" + amount);
        return true; // Simulate API call
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Stripe: Refunding $" + amount);
        return true; // Simulate API call
    }
}
