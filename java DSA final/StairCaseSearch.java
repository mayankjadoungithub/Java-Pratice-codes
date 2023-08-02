public class StairCaseSearch {
    public static boolean staircase(int matrix[][] ,int Key){
        int row =0,col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == Key){
                System.out.println("Found key at ("+ row +" ,"+col+ " )");
                return true;
            }
            else if(Key< matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
   System.out.println("key not found ");
      return false;
    }
    public static void main(String []a){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
                          int key =33;
                          staircase(matrix, key);
    
    }
}
