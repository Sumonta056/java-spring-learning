package basics.OOP.Abstraction;

public interface OnlinePayment {
    boolean authorize(double amount);
    boolean capture(double amount);
    boolean refund(double amount);
}
