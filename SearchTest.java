import java.util.Scanner;

public class SearchTest {
    static Boolean searchItem(int size){
        Scanner scanArray= new Scanner(System.in);
        int[] arr=new int[size];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scanArray.nextInt();
        }
        System.out.println("Enter element to be search");
        int search=scanArray.nextInt();
        scanArray.close();
        for(int i=0;i<arr.length;i++){
            if(search==arr[i])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size=scan.nextInt();
        
        boolean value=searchItem(size);
        System.out.println(value);
        scan.close();
    }
}
