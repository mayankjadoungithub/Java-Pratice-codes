import java.util.*;
import java.util.Collection;
public class ksmallest {
    public static int kthsmallest(int arr[],int k) {
        Arrays.sort(arr);
        return arr[k-1];

    }
    public static void main(String a[]) {
       int arr[]=new int[]{23,45,12,4,8,87};
       int k=2;
       System.out.println("Kth smallest element is "+kthsmallest(arr,k));
        
    }
}
