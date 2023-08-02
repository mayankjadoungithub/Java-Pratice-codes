class obj_ref{// difference b/w actual and formal argument
int a=10;    // formal scope is local only and actual inside a  hole class (global)
int b=20;
void swap(int a,int b){//  
(String[] a1)
int t;// int t;
t=a;// t=r.a;
a=b;r.a=r.b;
b=t;r.b=t;
}
public static void main(String[] a1)
{
obj_ref o1=new obj_ref();

o1.swap(o1.a,o1.b);
 //o1.swap(o1);
System.out.println("A="+o1.a);
System.out.println("B="+o1.b);
}
}