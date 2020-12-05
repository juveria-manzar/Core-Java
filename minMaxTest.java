import java.util.*;

public class minMaxTest{

    static void createArray(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        minMax(arr);
        in.close();
    }

    static void minMax(int[] arr){
        int g=arr[0];
        int s=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>g){
                g=arr[i];
            }
            if(arr[i]<s){
                s=arr[i];
            }
        }
        System.out.println("Maximum element is: "+g);
        System.out.println("Minimum element is: "+s);
    }
    public static void main(String[] args) {
        createArray();
    }
}