
import java.util.Scanner;
public class array{
    public static void main(String [] args){
        int n,max=0;

        
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        n=sc.nextInt();
        int a[]=new int[n];
//int min=a[1];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("elements of array is");
        for(int i=0;i<n;i++){
            
            System.out.println(a[i]);
        }
     for(int i=0;i<n;i++){
if(a[i]>max){
max=a[i];
}

}
System.out.println("maximum element in array is :"+max);




    }

}