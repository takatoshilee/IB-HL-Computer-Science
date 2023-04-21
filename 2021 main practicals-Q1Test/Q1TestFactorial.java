public class Q1TestFactorial
{
	
	public static void main (String[] args)
	{
		IBIO.output("My Name");
		int number = IBIO.inputInt("Enter an integer between 0 and 20: ");
		if(number < 0)
		{	IBIO.output("Error-number out of range.");
			main(null); // bad hack-never use again, use while loop
			//System.exit(1);
		}
		if(number > 20)
		{	IBIO.output("Error-number out of range.");
			main(null); // bad hack-never use again, use while loop
			//System.exit(1);
		}
		long factorial = 1;
		IBIO.out( number + "! = ");
		for(int i = number; i > 0; i--)
		{	factorial = factorial * i;
			if(number <= 10)
			{
				if(number > 1)
				{	IBIO.out(" x ");
				}
				IBIO.out( i );
			}
		}
		
		IBIO.out( factorial );
		int digits = 0;
		long result = factorial;
		while(result > 0)
		{	result = result/10;
			digits++;
		}
		IBIO.output("    Digits: " + digits);
	}
}

