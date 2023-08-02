import java.util.Scanner;
public class Graded3
{
public static void main(String[] args)
{
Scanner in = new Scanner (System.in);
//System.out.println("Mayank Jadoun & 1000014272");
System.out.println("Input Number 1: ");
double x = in.nextDouble();
System.out.println("Input Number 2: ");
double y = in.nextDouble();
x = Math.round(x * 10000);
y = Math.round (y * 10000);
x = x / 10000;
y = y / 10000;
if (x == y)
{
System.out.println("SAME");
}
else
{
System.out.println("NOT SAME");
}
}
}