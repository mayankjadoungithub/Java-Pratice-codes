//Print the number of 7’s that are inthe 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2
public class countof7in2D {
    public static void main(String []a){
        int Countof7 =0;
        int [][] array = {{4,7,8},{8,8,7}};
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 7){
                    Countof7++;
                }
            }
        }
        System.out.println("count pf 7 is : "+ Countof7);
    }
}
