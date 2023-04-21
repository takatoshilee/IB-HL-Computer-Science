/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Factorial		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		IBIO.output("Takatoshi Lee");
		int number = IBIO.inputInt("Enter a number between 1 and 12: ");
		while (number < 0)
		{
			number = IBIO.inputInt("Enter a number between 1 and 12: ");
			IBIO.output("Error-number out of range.");
			main(null);
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


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
