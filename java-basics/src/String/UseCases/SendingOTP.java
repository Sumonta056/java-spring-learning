package String.UseCases;

import java.util.UUID;

public class SendingOTP {
    public static void main(String[] args) {
        String otp = String.valueOf((int)(Math.random() * 9000 + 1000)); // 4-digit OTP
        System.out.println("Your OTP is: " + otp);

        String orderId = "ORD-" + UUID.randomUUID().toString();
        System.out.println("Your order ID is: " + orderId);

    }
}
