public class reversearray {
    public static void main(String a[]) {
     int []arr={1,3,4,5,6,4,7,8};
     System.out.println("orignal array");
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

     }
     //System.out.println();
     System.out.println("\n Reverse array is ");
     for(int i=arr.length-1;i>=0;i--){
        
        System.out.print(arr[i]+" ");

     }


    }
}
