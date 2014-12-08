
import java.util.Scanner;

import java.text.DecimalFormat;

public class BikeTester 
{

	public static void main(String [] args)
	{

		SalesEmployee[] list = new SalesEmployee[5];

		Scanner input = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		list[0] = new SalesPerson("Tara Keena","1833454K");
		list[1] = new SalesAgent("Sean Farrell", "26367248h");
		list[2] = new SalesPerson("Harry Henson","37373682g");
		list[3] = new SalesAgent("Sally Field", "8733738l");
		list[4] = new SalesPerson("Janet Porter", "2625495d");

		for (int i = 0; i<list.length; i++ ) 
		{
			System.out.printf("Enter sales for Employee %d: \n", i +1);

			list[i].setSalesAmount(input.nextDouble());
		}

		for (int i = 0; i<list.length; i++) 
		{
			
			list[i].computeTotalPayment();

		}
		
		for (int i =0; i <list.length; i++)
		{
			
			System.out.println(list[i].getName()+ "\nPPS NO: " + list[i].getPpsNumber() + "\nCommission Payment is:€" + df.format(list[i].getCommissionAmount()) );
			System.out.println("Total Value of Sales:€" +df.format(list[i].GetSalesAmount()+list[i].getCommissionAmount() )+"\n");			

		} 
		
	}
	
}









