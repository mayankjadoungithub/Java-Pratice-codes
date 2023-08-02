import java.util.*;


public class creatio2DArray {
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j] == key){
                System.out.println("found at cell  (" + i+ ","+j+")");
                   return true;
              }
            }
           
         }
         System.out.println("key not found");
         return false;
    }
    public static void main(String a[]){
        int matrix[][] = new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your 2D Array1 2");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){ 
            matrix[i][j] = sc.nextInt();

          }
    }

     // output
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.println(matrix[i][j]+" ");
        }
        System.out.println();
     }
    search(matrix,5);
}
}
