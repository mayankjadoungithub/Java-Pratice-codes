class parent{
void show(){
System.out.println("parents....");
}
}
class child extends parent{
void show(){
System.out.println("child ........");
}
}
class inherit{

public static void main(String [] a){
child o1 =new child();
o1.show();
}
}



