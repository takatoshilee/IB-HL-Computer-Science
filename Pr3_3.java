/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr3_3		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int sum = 0;
		int n = IBIO.inputInt("Enter a number: ");
		do 
		{
			int digit = n % 10;
			sum = sum + digit*digit*digit;
			n = n / 10;
		}
		while (n != 0);
			IBIO.output("The sum of the digits of the number is " + sum);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
