import java.util.Calendar;
class Calender{
public static void main(String [] a1){
double d=1000.1256;
String out1=String.format("%.2f",d);
System.out.println(out1);
double d1= Double.parseDouble(out1);
System.out.println("value of d1 is "+d1);
String out= String.format("%1.2f",d);
String a="Hello";
String b="Java";
String f="test";
int c=20;
int e=10;
System.out.println(a+b+c);
System.out.println(a+b+c+e);
System.out.println(a+b+(c+e));
System.out.println("value1 = "+a+"\tvalue2= "+b);
System.out.format("%n value 1= %s  \t value 2 = %s",a,b);

//System.out.println("%n value1 = %1$s  \t  value2 = %1$s ",a,b);
System.out.printf("%n  value1 = %1$s    value = %3$s",a,b,f);
Calender Cal = Calendar.getInstance();

System.out.format("%n %tB %te  %tY%n",Cal,Cal,Cal);
System.out.format("%n %tA %tB  %tY%n",Cal,Cal,Cal);
System.out.format("%n %tH %tM  %tp%n",Cal,Cal,Cal);
System.out.format("%n %tH %tM  %tS%n",Cal,Cal,Cal);

}
}


