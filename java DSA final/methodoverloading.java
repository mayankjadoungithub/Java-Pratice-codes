import java.util.*;

public class methodoverloading {
    public static void main(String []a){
        Calculator cal = new Calculator();
     System.out.println(cal.sum(1,2));
     System.out.println(cal.sum((float)2.3,(float)9.4));
     System.out.println(cal.sum(2,3,4));

        
    }
   
    
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

