package String.UseCases;

public class PasswordHashing {
    public static String hashPassword(String password) {
        StringBuilder str = new StringBuilder();
        byte[] bytes = password.getBytes();
        for (byte b : bytes) {
            str.append(String.format("%02x", b));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String password = "123";
        System.out.println(hashPassword(password));
    }

}
