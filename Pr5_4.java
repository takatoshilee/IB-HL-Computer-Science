/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr5_4		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double numerator = 1;
		double denominator = 1;
		double pi = 0;
		double term = 1;
		double denominatorMultiple = 1;
		for (int count = 1; count <= 100; count++) {
			pi = pi + term;
			numerator = numerator * count;
			denominatorMultiple = denominatorMultiple + 2;
			denominator = denominator * denominatorMultiple;
			term = numerator / denominator;
		}
		System.out.println(pi * 2);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
