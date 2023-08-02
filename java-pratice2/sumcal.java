Import java.util.Scanner;
class sum_arr
{
	int sumarr(int a[])                            // function declaration and definition
	{
		int sum=0, I;
		for(i=0;i<a.length;i++)
			sum=sum+a[i];
	return(sum);
	}
	public static void main(String ar[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
			a[i]=sc.nextInt();
		int sum=sumarr(a);                           // function call
	System.out.println(“Sum=“+sum);
	}
}
