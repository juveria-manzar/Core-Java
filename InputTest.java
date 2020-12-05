import java.util.Scanner;

public class InputTest{
    public static void main(String... s) {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        scan.close();
    }
}