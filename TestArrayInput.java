import java.util.Scanner;

public class TestArrayInput {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println(scan.nextInt());
        }
        scan.close();
    }
}
