/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr5_1		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double term = 1;
		double sum = 0;
		for(int i = 0; i < 100; i++) {
			sum  = sum + term;
			term = term / 5.0;
		}
		IBIO.output("total is " + sum);
	}
}


/*

prints 1.25 wrong
*/
