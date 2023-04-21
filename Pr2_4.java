/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr2_4		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			int m = i*i*i;
			if (m < 10)
				IBIO.output("   " + m);
			else if (m < 100)
				IBIO.output("  " + m);
			else if (m < 1000)
				IBIO.output(" " + m);
			else
				IBIO.output(m);
		}
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
