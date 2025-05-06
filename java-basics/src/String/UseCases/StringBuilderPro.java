package String.UseCases;

public class StringBuilderPro {
    public static void main(String[] args) {
        String userName = "John";
        StringBuilder sb = new StringBuilder();
        sb.append("Dear ").append(userName).append(",\n")
                .append("Your subscription is expiring on ").append(".");
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
