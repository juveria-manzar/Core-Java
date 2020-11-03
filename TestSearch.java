import java.util.Scanner;

public class TestSearch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size =scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Value");
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
    }
}
class SearchArray{
    
    public int searchArray(int[] arr, int value){
        int ar_length= arr.length;
        for(int i=0;i<ar_length;++i){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}