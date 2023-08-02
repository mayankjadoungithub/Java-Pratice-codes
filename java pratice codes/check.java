
import java.text.SimpleDateFormat;
import java.util.Date;
class Person {
 static class Student{
static String status="Freshman";
 public void printData(){
 System.out.println(" the status of the student is "+status);
 }
 }
 static class Employee{
 String office;
 int salary;
 int dataHired;
 Employee(String off, int money){
 office=off;
 salary=money;
 }
public String DateHired(){
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 Date date = new Date();
 String data= formatter.format(date);
 return " the date of the joining of the employee is "+data;
}
public void printData(){
 System.out.println(" the salary of the employee is "+salary);
 System.out.println(" the office for the employee is "+office);
 System.out.println(DateHired());
}
 static class Faculty{
 int officeHour;
 String rank ;
 Faculty(int offhour, String rnk) {
 officeHour=offhour;
 rank=rnk;
 }
 public void printData(){
 System.out.println(" the officehour of the faculty is "+officeHour);
System.out.println("the rank of the faculty is "+rank);
 }
 }
 static class Staff{
String title;
Staff(String name){
title=name;
}
public void printData(){
 System.out.println(" the title of the staff is "+title);
}
 }
 }
}
public class check {
 public static void main(String[] args) {
 System.out.println(" name : Tushar Kumar  \t\t\t sap id =1000014268");
 Person.Student obj2 = new Person.Student();
 obj2.printData();
 Person.Employee obj3 = new Person.Employee("it sector",5500);
 obj3.printData();
 Person.Employee.Faculty obj4= new Person.Employee.Faculty(260,"mid-senior");
 obj4.printData();
 Person.Employee.Staff obj5= new Person.Employee.Staff(":Tushar Kumar ");
 obj5.printData();
 }
}