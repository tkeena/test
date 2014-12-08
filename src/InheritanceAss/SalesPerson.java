public class SalesPerson extends SalesEmployee
{

	public SalesPerson() // constructor
	{ 
		
		super(); // call constructor from base class SalesEmployee
		
	}

	public SalesPerson(String name, String ppsNumber)
	{

		super(name, ppsNumber);

	}
	
	public void computeTotalPayment()
	{

			totalAmount = (.15 *salesAmount) + totalAmount;		

	}
}





