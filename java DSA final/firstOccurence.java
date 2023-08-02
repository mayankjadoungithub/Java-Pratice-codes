public class firstOccurence {
    public static int Firstocc(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return Firstocc(arr, key, i+1);
    }
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i]== key){
            return i;
        }
         return isFound;
    }
     // power function
     public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
     }
    public static void main(String []a){
        int arr[] = {2,3,5,4,56,6,5,4,3,6,5,7};
        //System.out.println((lastOcc(arr, 5, 0)));
        System.out.println(power(2, 10));
    }

}
