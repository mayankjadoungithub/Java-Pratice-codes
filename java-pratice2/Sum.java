import java.util.*;

class Sum {

	static int sum(int x, int y){
		return x+y;
	}

	static int sum(int x, int y, int z){
		return x+y+z;
	}

	static float sum(float x, float y){
		return x+y;
	}

	

	public static void main(String[] arg){

		int x , y , z ;
		float a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter num 1(int): ");
		x = sc.nextInt();
		System.out.print("Enter num 2(int): ");
		y = sc.nextInt();
		System.out.print("Sum is: "+sum(x,y));

		System.out.print("\n\nEnter num 1(int): ");
		x = sc.nextInt();
		System.out.print("Enter num 2(int): ");
		y = sc.nextInt();
		System.out.print("Enter num 3(int): ");
		z = sc.nextInt();
		System.out.print("Sum is: "+sum(x,y,z));
		
		System.out.print("\n\nEnter num 1(Float): ");
		a = sc.nextFloat();
		System.out.print("Enter num 2(Float): ");
		b = sc.nextFloat();
		
		System.out.print("Sum is: "+sum(a,b));


	}


}