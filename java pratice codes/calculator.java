import java.util.Scanner;
class calculator {
  public static void main(String[] args) {
      System.out.println(" Name:-Mayank Pratap Jadoun\n  sap id:- 1000014272");
    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /,%");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextDouble();
    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      
        
case '%':
        result = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
    input.close();
  }
}