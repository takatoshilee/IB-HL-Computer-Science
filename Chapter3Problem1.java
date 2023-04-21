/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr3_1		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int x;
		do 
		{ x = IBIO.inputInt("Enter a number less than 100: ");
		} 	
		while (x <= 0  || x >= 100 || x % 2 != 0 );
		IBIO.output("Thank you");
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
