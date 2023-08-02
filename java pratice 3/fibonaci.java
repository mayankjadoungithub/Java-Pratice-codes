import java.util.Scanner;
public class fibonaci
{
public static void main(String[] args) 
{
System.out.println("Enter the number you want till the series go:");
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int t1=0,t2=1,x;
//System.out.println("\nMayank  ");
 for (int i = 1; i <= n; i++)
 {
 x=t1+t2; 
 t1=t2;
 t2=x; 
 if(t1%5==0)
 continue;
System.out.printf("%d ",t1);

 }
 //System.out.println("\n  sap id : 1000014267");
 }
 }
