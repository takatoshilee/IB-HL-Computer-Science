/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr3_4		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int x,count;
		x = IBIO.inputInt("Enter a number ");
		count = 0;
		while (x != 1)
		{
			if (x % 2 == 0)
				x = x / 2;
			else 
				x = x * 3 + 1;
			count = count + 1;
			IBIO.out(x + " ");
		}
		IBIO.output("\nTotal number of steps = " + count );
	}
}
 
	


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
