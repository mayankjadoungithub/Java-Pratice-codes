import java.util.*;
import java.util.Scanner;
public class countocuurence {
    public static void main(String a[]){
        int n,x,count=0,i=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want in arrys");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the elements:");
        for( i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter the element you want to count no. occrence:");
         x=sc.nextInt();
        for( i=0;i<n;i++){
            if(a[i] == x){
                count++;
            }
          System.out.println("no of occurrenve of the emelent:"+count);
        }
    }
}
