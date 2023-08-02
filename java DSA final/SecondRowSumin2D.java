// Print out the sum of the numbers inthe second row of the “nums” array.
// Example :Input -
//  int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//  Output - 18
public class SecondRowSumin2D {

    public static void main(String []a){
        int sum=0;
        int[][] nums = {{1,4,8},{11,4,6},{2,5,7}};
        for(int j=0;j<nums[0].length;j++){
          sum += nums[0][j];
        }
        System.out.println("Sum of second row is :"+sum);
    }
     
}
