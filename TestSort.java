import java.util.Scanner;

public class TestSort {  
    public static void main(String[] args)   
    {  
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size =scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Value");
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        
        Array obj=new Array();
        System.out.println("Array to sort is :");
        obj.printArray(arr);
        obj.sortArray(arr);
        System.out.println("Sorted Array is :");
        obj.printArray(arr);
    }  
}

class Array{
    
    public void sortArray(int[] arr){
        int ar_length= arr.length;
        for(int i=1;i<ar_length;++i){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
