public class recursion {
public static int fib(int n){
    
    if(n==0||n==1){
        return n;
    }


    int f1= fib(n-1);
    int f2= fib(n-2);
    int fn = f1+f2;
    return fn;
}
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
       printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
       
    }
    public static int fact(int n){
        if(n==0)
        return 1;
        int fnm1= fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    public static void main(String []a){
        int n;
        //printDec(n);
        //printInc(n);
        //System.out.println(fact(n));
        //System.out.println(fib(n));
        System.out.println(fib(23));
        System.out.println(fib(24));
        System.out.println(fib(25));
        System.out.println(fib(26));
    }
}
