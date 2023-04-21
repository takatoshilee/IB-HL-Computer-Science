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
		{
			x = IBIO.inputInt("Enter a even number between 0 and 100: ");
		}
		while (x % 2 != 0 || x <= 0 || x >= 100);
		IBIO.output("thank you");
	}
}

/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
