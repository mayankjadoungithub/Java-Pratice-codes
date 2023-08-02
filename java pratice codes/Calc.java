import java.util.*;

interface iclac {
    int add(int a, int b);

    int sub(int a, int b);

    int multiply(int a, int b);

    double div(double a, double b);

    int mod(int a, int b);

}

class Calc implements iclac {

    // public int a;
    // public int b;

    public int add(int a, int b) {
        System.out.print("add " + a + " and " + b + " = ");
        return a + b;
    }

    public int sub(int a, int b) {
        System.out.print("subtract " + a + " and " + b + " = ");
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.print("multiply " + a + " and " + b + " = ");
        return a * b;
    }

    public double div(double a, double b) {
        System.out.print("division " + a + " and " + b + " = ");
        return a / b;
    }

    public int mod(int a, int b) {
        System.out.print("mod " + a + " and " + b + " = ");
        return a % b;
    }

    public static void main(String[] args) {
        //System.out.println("\n Name - Mayank Pratap Jadoun \tSAP ID:- 1000014272");
        Scanner input = new Scanner(System.in);
        int a, b;
        char c;
        System.out.println("Enter two numbers to perform the operation: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.print("Enter the operator like (+,-,*,/,%): ");
        c = input.next().charAt(0);
        Calc obj = new Calc();

        switch (c) {
        case '+':
            System.out.println(obj.add(a, b));
            break;
        case '-':
            System.out.println(obj.sub(a, b));
            break;
        case '*':
            System.out.println(obj.multiply(a, b));
            break;
        case '/':
            System.out.println(obj.div(a, b));
            break;
        case '%':
            System.out.println(obj.mod(a, b));
            break;
        default:
            System.out.println("Invalid Input!!");
        }
    }
}