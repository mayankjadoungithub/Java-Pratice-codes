import java.util.*;
public class BitManupulationEvenorOdd {
 public static void EvenorOdd(int n){
    int bitMask=1;
    if((n & bitMask)==0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");

    }

 }   
 public static void main(String []a){
    EvenorOdd(16);
    EvenorOdd(5);
    
 }
}
