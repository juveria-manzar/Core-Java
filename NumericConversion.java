//Numeric primitives can be cast in two ways
//Implicit casting happens when the source type has smaller range than the target type.
//Explicit casting has to be done when the source type has larger range than the target type.

public class NumericConversion{
    public static void main(String...ars) {
        //implicit casting
        // byte byteVar=42;
        // short shortVar=byteVar;
        // int intVar=byteVar;
        // long longVar=intVar;
        // float floatVar=longVar;
        // double doubleVar=floatVar;

        //Explicit casting
        // double doubleVar=42.0d;
        // float floatVar=(float)doubleVar;
        // long longVar=(long)floatVar;
        // int intVar = (int) longVar;
        // short shortVar = (short) intVar;
        // byte byteVar = (byte) shortVar;


        char char1 ='a';
        char char2 = 'b';
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;
        // char1 = char1 + char2; // Error: Cannot convert from int to char;
        // short1 = short1 + short2; // Error: Cannot convert from int to short;
        int1 = char1 + char2; // char is promoted to int.
        System.out.println(int1);
        int1 = short1 + short2; // short is promoted to int.

        int1 = char1 + short2; // both char and short promoted to int.
        float1 = short1 + float2; // short is promoted to float.
        int1 = int1 + int2; // int is unchanged.
    }


    //BE CAREFUL! BEARS SHOULDNT INGEST LARGE FURRY DOGS

    // TYPE PROMOTION RULES
    // All byte and short values are promoted to int.
    // If one operand is a long, the whole expression is promoted to long.
    // If one operand is a float, the entire expression is promoted to float.
    // If any of the operands is double, the result is double.
}