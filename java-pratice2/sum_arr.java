import java.util.Scanner;
class sum_arr{
 static int sumarr(int a[]){
int s=0,i;
for(i=0;i<a.length;i++){
s=s+a[i];
}
return s;
}

public static void main(String a1[]){
int s=0;
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++){
a[i]=sc.nextInt();
}
s=sumarr(a);
System.out.println("sum is "+s);
}
}
