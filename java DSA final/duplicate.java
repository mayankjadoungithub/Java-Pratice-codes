//import java.util.Scanner;
import java.util.*;
public class duplicate {
    public static void main(String a[]){
       // int arr[]=  new int[] {2,3,45,2,3,5,3,6,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int arr[]= new int[n];   
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Search for the duplicate element in the array");
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j])
                System.out.println(arr[j]);
            
        }
        
        }
        
    }
    
}

