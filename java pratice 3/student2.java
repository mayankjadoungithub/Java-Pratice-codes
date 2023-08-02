class student2{
int roll;
String name;

void input(int r,String n){
roll=r;
name=n;
}
void display(){
System.out.println("roll: ="+roll);
System.out.println("Name:"+name);
}

public static void main(String[]a1){
student2 s1 = new student2();
student2 s2 = new student2();
s2.input(101,"mayank");
s1.input(102,"pglet");
s1.display();
s2.display();
}
} 