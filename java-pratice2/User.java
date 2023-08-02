import java.util.Scanner;
class User{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter name,age,salary");
String name=sc.nextLine();
int age=sc.nextInt();
double salary=sc.nextDouble();
System.out.println("Name :"+ name);
System.out.println("age :"+ age);
System.out.println("salary: "+ salary);
}
}


