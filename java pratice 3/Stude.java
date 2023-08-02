import java.util.Scanner;
public class Student1{
int roll_no;
String name;
static String univ_name = "DIT";
String course;
void input()
{

Scanner in =new Scanner(System.in);
System.out.println("Enter Your Name:-");
name = in.nextLine();
System.out.println("Enter Your Roll no:-");
roll_no = in.nextInt();

while (true)
{

System.out.println("Enter Your Course:- ");
course = in.nextLine();
if(course.equalsIgnoreCase("Java"))
{

break;
}
}
}
void display()
{

System.out.println("Name:- " +name);
System.out.println("Roll no:- " +roll_no);
System.out.println("Course:- " +course);
System.out.println("University Name:- " +univ_name);

}
public static void main(String args[])
{

Student obj = new Student();
obj.input();
obj.display();

}
}
