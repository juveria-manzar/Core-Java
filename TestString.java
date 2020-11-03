public class TestString{
    public static void main(String [] args) {
        String s= new String("EXponent");
        System.out.println(s.concat("s"));
        System.out.println(s.charAt(0));
        System.out.println(s.equals("exponent"));
        System.out.println(s.equalsIgnoreCase("Exponent"));
        System.out.println(s.substring(0));
        System.out.println(s.substring(0,3));
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.replace('t','s'));
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
    }
}