public class MaxandMin {
    public static void FindmaxAndmin(int []a){
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                 min=a[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min :"+min);
    }
    public static void main(String a[]){
int []n={4,56,32,67,23,87};
    FindmaxAndmin(n);
    }
}
