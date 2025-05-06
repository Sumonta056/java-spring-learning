package ExecptionHandling;

public class RealApp {
    public void register(String username, int age) throws InvalidAgeException {
        if(age < 18 || age > 60){
            throw new InvalidAgeException("Invalid age: " + age);
        }
    }
    public static void main(String[] args) {
        RealApp app = new RealApp();
        try {
            app.register("John", 17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
