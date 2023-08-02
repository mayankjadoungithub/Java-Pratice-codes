//Create a class stock with itemno, name and qty. Create three functions issue(), returnitem() 
// and displaystock().

import java.util.*;
class stock{
	int[] itemno = new int[100];
	String[] name = new String[100];
	int[] qty = new int[100];
	int num;
	void issue()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Total no. of items : ");
		num = s1.nextInt();

		for(int i=0; i<num; i++)
		{
			System.out.println("<------- Enter Details of item " + (i+1) +" ------>");
			System.out.println("Enter Item no.: ");
			itemno[i] = s1.nextInt();
			System.out.println("Enter Item Name: ");
			name[i] = s1.next();
			System.out.println("Enter Item quantity: ");
			qty[i] = s1.nextInt();
		}	
	}
	
	void returnitem(int itemnum)
	{
		int f =0;
		for(int i=0; i<num; i++)
		{
			if(itemno[i]==itemnum)
			{
				System.out.println("Item Found name is -> " +name[i]);
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println("Item Not found in stock");

	}
	
	void displaystock()
	{
		System.out.println("<--------Display Stock---------->");
		
		for(int i=0; i<num; i++)
		{
			System.out.println("ItemNo. " +itemno[i]);
			System.out.println("Item Name " +name[i]);
			System.out.println("Item Quantity " +qty[i]);
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		stock s2 = new stock();
		s2.issue();

		System.out.println("<\n--------Item Search---------->");
		System.out.println("Enter Item no.: ");
		int num1 = sc.nextInt();
		s2.returnitem(num1);

		s2.displaystock();
	}	
}