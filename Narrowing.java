public class Narrowing {
    public static void main(String[] args) {
        double doubleValue = 95.67;
        int intValue = (int) doubleValue;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value after narrowing conversion: " + intValue);
    }
}
