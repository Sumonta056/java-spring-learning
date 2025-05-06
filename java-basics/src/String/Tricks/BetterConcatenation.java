package String.Tricks;

public class BetterConcatenation {
    public static void main(String[] args) {
        // ❌ Avoid this in loops
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += i;  // slow, creates new string every time
        }
        System.out.println(result);

        // ✅ Do this instead
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        String finalResult = sb.toString();
        System.out.println(finalResult);;

    }
}
