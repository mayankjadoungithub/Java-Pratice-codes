
import java.util.Scanner;

import java.util.*;
public class missing {
public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of  n:");
    int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter n-1 numbers:");
     for(int i=0;i<=n-2;i++){
        arr[i]=sc.nextInt();
     }
        // finding missing element
        int sumofall = (n*(n+1))/2;
        int sumofarr=0;
        
        for(int i=0;i<=n-2;i++){
            sumofarr= sumofarr+arr[i];
        }
        int missingnumber = sumofall-sumofarr;
        System.out.println("Missing number is :"+missingnumber);

        

     }

}
    

