import java.util.*;
public class Student {  

int rollno;  
String name;  

void input(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Roll no: ");
	rollno = sc.nextInt();
	System.out.print("Enter Name: ");
	name = sc.next();
}

void display(){  
	System.out.printf("Student Id : %d\nStudent Name : %s\n",rollno,name);  
}

Student(){  
	System.out.println("This is a default constructor");
}  
  
Student(int x, String y){  
	rollno = x;  
	name = y;  
}
  
public static void main(String[] args) {   
	Student s = new Student();  
	
	s.input();
	s.display();
	
	System.out.println("\nDefault Constructor values are ");  
	System.out.printf("Student Id : %d\nStudent Name : %s\n",s.rollno,s.name); 
  
	System.out.println("\nParameterized Constructor values are ");  
	Student student = new Student(10, "David");  
	System.out.printf("Student Id : %d\nStudent Name : %s\n",student.rollno,student.name);  
}  
}