public class WideningProgram {
    public static void main(String[] args) {
        int intValue = 21;

       
        double doubleValue = intValue;

        
        float floatValue = intValue;

        
        boolean booleanValue = intValue != 0;

        String stringValue = String.valueOf(intValue);

        System.out.println("Widening conversion from int to double: " + doubleValue);
        System.out.println("Widening conversion from int to float: " + floatValue);
        System.out.println("Conversion from int to boolean: " + booleanValue);
        System.out.println("Widening conversion from int to String: " + stringValue);
    }
}
