

public class SalesAgent extends SalesEmployee {

	public SalesAgent() // constructor
	{ 
		super(); // call constructor from base class

	}



	public SalesAgent(String name, String ppsNumber)
	{

		super(name, ppsNumber);

	}


	public void computeTotalPayment()


	{

		totalAmount = (salesAmount*.10) + totalAmount;		


	}



} // end class
