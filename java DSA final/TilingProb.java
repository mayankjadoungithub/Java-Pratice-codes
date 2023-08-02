public class TilingProb {
    public static int tilingproblem(int n){
        if(n==0|| n==1){
            return 1;
        }

        int f1= tilingproblem(n-1);

        int f2= tilingproblem(n-2);
         int totalWays= f1+f2;

        return totalWays;
    }
    public static void main(String []a){
      
        System.out.println(tilingproblem(4));
    }
}
