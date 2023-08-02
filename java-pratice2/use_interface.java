interface calculator{
int add(int a,int b);
int mul(int a,int b);
int divide(int a,int b);
int moduls(int a,int b);
}
 class test implements calculator{

public int add(int a,int b){
return (a+b);
}
public int mul(int a,int b){
return (a*b);
}
public int sub(int a,int b){
return (a-b);
}
public int divide(int a,int b){
return (a/b);
}
public int moduls(int a,int b){
return (a%b);
}
}
class use_interface{
public static void main(String [] a){
test t1 = new test();
System.out.println(t1.add(5,9));
System.out.println(t1.mul(4,7));
System.out.println(t1.sub(9,4));
System.out.println(t1.divide(8,2));
System.out.println(t1.moduls(10,3));
}
}

