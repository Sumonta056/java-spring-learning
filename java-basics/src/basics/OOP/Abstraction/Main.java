package basics.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        PaymentProcess stripe = new Stripe("123456");
        stripe.processPayment(1000);

        System.out.println("-------------------");

        PaymentProcess paypal = new Paypal("654321");
        paypal.processPayment(2000);

        System.out.println("-------------------");

        PaymentProcess bkash = new BkashPayment("789012");
        bkash.processPayment(3000);
    }
}
