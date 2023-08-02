import java.util.Scanner;
public class Fact{
public static void main(String[] args){
int n;

int i,f=1;
Scanner sc=new Scanner(System.in);
for(; ;){

System.out.println("Enter a correct number : ");
n=sc.nextInt();
if(n==5)
continue;
for(i=1;i<=n;i++){
f=f*i;
}
System.out.println("factorial is = "+f);
break;
}// while close 
}
}
