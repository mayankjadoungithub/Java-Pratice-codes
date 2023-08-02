public class sortascending {
    public static void main(String a[]){
        int  arr[] = new int[] {23,45,32,12,78,98};
        System.out.println("Original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
       
        System.out.println("Applying sorting inascending order:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println();
        System.out.println(" Element After sorting");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

      
    }
}
