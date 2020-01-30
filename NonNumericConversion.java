//Non Numeric Data Types: Boolean and Char

//The boolean type CANNOT be cast to/from any other primitive type.
//(But it's possible for only Strings in Java. with the use of function Boolean.parseBoolean(string)).
public class NonNumericConversion{
    public static void main(String[] args) {
        //int badInt = (int) true;

        // char char1 = (char) 65; // A
        // byte byte1 = (byte) 'A'; // 65
        // short short1 = (short) 'A'; // 65
        // int int1 = (int) 'A'; // 65
        // char char2 = (char) 8253; // ‽
        // byte byte2 = (byte) '?'; // 61 (truncated code-point into the ASCII range)
        // short short2 = (short) '?'; // 8253
        // int int2 = (int) '?'; // 8253

        //String str1= (Boolean)"true";// //incompatible types: String cannot be converted to Boolean
        //Boolean bol1=(String)"true";
        String str2="ANything"; 
        String str3="hello";
        Boolean bol2=true;

        System.out.println(Boolean.parseBoolean(str2));
        //System.out.println(toString(bol2)); 
        //The method toString() in the type Object is not applicable for the arguments (Boolean)
    }
}