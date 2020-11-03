public class TestStringBuffer{
    public static void main(String [] args) {
        StringBuffer s= new StringBuffer("EXponent");
        System.out.println(s.charAt(0));
        System.out.println(s.append("planets"));
        s.setCharAt(0,'b');
        System.out.println(s.delete(3,10));
        System.out.println(s.substring(0,3));
        System.out.println(s.insert(3,"planet"));
        System.out.println(s.reverse());
        System.out.println(s.capacity());
    }
}