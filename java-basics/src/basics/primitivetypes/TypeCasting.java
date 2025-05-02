package basics.primitivetypes;

public class TypeCasting {
    public static void main(String[] args) {
       int value = 1;
       String casted = String.valueOf(value);
       System.out.println(casted);

       String number = "123";
       int casterToNum = Integer.parseInt(number);
       System.out.println(casterToNum);
    }
}
