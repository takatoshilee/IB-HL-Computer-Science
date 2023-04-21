/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr5_3		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double term = 1;
		double pi = 0;
		double denominator = 1;
		int sign = 1;
		for (int count = 1; count <= 10000; count++) {
			pi = pi + term;
			denominator = denominator + 2;
			sign = sign * -1;
			term = 1 / (sign * denominator);
		}
		System.out.println(4 * pi);
	}
}


/*
if, else, else-if, solutions which will nudge you to use these rly hard
know for loop rly well
know whether i need to use do, while, or do while
*/
