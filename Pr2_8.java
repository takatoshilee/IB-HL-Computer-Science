/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr2_8		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 1; i <= 1000000; i++)
			{
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
			{
				++count; //IDK how this part works
			}
		}
		IBIO.output (count);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
