package basics.OOP.Abstraction;

public abstract class PaymentProcess  implements OnlinePayment {
    protected String transactionId;

    public PaymentProcess(String transactionId) {
        this.transactionId = transactionId;
    }

    protected boolean validate(double amount){
        System.out.println("Validating payment of " + amount + " for transaction ID: " + transactionId);
        return amount > 0;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " for transaction ID: " + transactionId);

        if(!validate(amount)) {
            System.out.println("Invalid payment amount.");
            return;
        }

        if (authorize(amount)) {
            if (capture(amount)) {
                System.out.println("Payment captured successfully.");
            } else {
                System.out.println("Failed to capture payment.");
            }
        } else {
            System.out.println("Authorization failed.");
        }

    }
}
