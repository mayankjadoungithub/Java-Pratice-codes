import java.util.*;
abstract class calculator {
    abstract int add (int n1,int n2);    
    abstract int minus(int n1,int n2);   
    void display(int n1,int n2,int c,int d){
        System.out.println("First Number = "+n1+ "\nSecond Number = "+n2+"\nAfter Addition = "+c+"\nAfter Subtraction = "+d);
    }
}
class Simple_calculator extends calculator{
    int result1;
    int result2;
    
    public int add(int n1,int n2 ){
        result1=n1+n2;
        return result1 ; 
    }
    public int  minus (int n1,int n2 ){
        result2=n1-n2;
        return result2 ;
    }
    Simple_calculator(){

    }
    Simple_calculator(int a,int b){
        result1=a;
        result2=b;
    }
}

class dummy{

    public static void main(String [] args){
        Simple_calculator s=new Simple_calculator();
        System.out.println("\n\n\n\t\t\t\t\t*******Priyanshu Mittal ******");
        System.out.println("\t\t\t\t\t*******SAP ID:1000013921******");
        System.out.println("\t\t\t\t\t*******GRADED LAB:- 06*****");
        System.out.print("Enter the First number = ");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print("Enter the Second number = ");
        Scanner sc1 =new Scanner(System.in);
        int n2=sc1.nextInt();
        System.out.println("First Number  = " +n1);
        System.out.println("Second Number  = " +n2);
        System.out.println("After Addition = " +s.add(n1,n2));
        System.out.println("After Subtraction = " +s.minus(n1,n2));
        sc.close();
        sc1.close();
        System.out.println();
    }
}