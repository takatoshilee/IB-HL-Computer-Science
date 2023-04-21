/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr3_2		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int x;
		int i = 1;
		do
		{
			x = IBIO.inputInt("Enter a number greater than 1: ");
		}
		while (x <= 1);
			do
			{ 
				i++;
			} 
			while (x % i != 0);
				if (x == i)
					IBIO.output("prime");
				else
					IBIO.output("The smallest prime that goes into the number is: " + i);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
