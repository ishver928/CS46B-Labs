package cast;

public class Primitives {
    public static void dumpMaxValues() {
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);
    }

    public static void main(String[] args) {
    
    dumpMaxValues();

    // int = long
    long longValue1 = Long.MAX_VALUE;
    int intValue1 = (int) longValue1;
    System.out.println("int = long: " + longValue1 + ", " + intValue1);

    // int = long
    long longValue2 = Long.MAX_VALUE - 5;
    int intValue2 = (int) longValue2;
    System.out.println("int = long: " + longValue2 + ", " + intValue2);

    // long = int
    int intValue3 = Integer.MAX_VALUE;
    long longValue3 = intValue3;
    System.out.println("long = int: " + intValue3 + ", " + longValue3);

    // double = byte
    byte byteValue1 = 100;
    double doubleValue1 = byteValue1;
    System.out.println("double = byte: " + byteValue1 + ", " + doubleValue1);

    // byte = double
    double doubleValue2 = 45.67;
    byte byteValue2 = (byte) doubleValue2;
    System.out.println("byte = double: " + doubleValue2 + ", " + byteValue2);

    // byte = double
    double doubleValue3 = 456.789;
    byte byteValue3 = (byte) doubleValue3;
    System.out.println("byte = double: " + doubleValue3 + ", " + byteValue3);

    // long = float
    float floatValue1 = 12345.6789f;
    long longValue4 = (long) floatValue1;
    System.out.println("long = float: " + floatValue1 + ", " + longValue4);

    // long = float
    float floatValue2 = Float.MAX_VALUE;
    long longValue5 = (long) floatValue2;
    System.out.println("long = float: " + floatValue2 + ", " + longValue5);

    // float = long
    long longValue6 = Long.MAX_VALUE;
    float floatValue3 = (float) longValue6;
    System.out.println("float = long: " + longValue6 + ", " + floatValue3);
}
}

