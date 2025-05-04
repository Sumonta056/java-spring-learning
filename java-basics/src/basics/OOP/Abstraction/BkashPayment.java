package basics.OOP.Abstraction;

public class BkashPayment extends PaymentProcess{
    public BkashPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public boolean authorize(double amount) {
        System.out.println("Bkash: Authorizing $" + amount);
        return false;
    }

    @Override
    public boolean capture(double amount) {
        System.out.println("Bkash: Capturing $" + amount);
        return false;
    }

    @Override
    public boolean refund(double amount) {
        return false;
    }
}
