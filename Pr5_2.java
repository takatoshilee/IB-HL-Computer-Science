/*

Pr 5.2 Write a program that it adds up the sequence
1/1 + 1/4 + 1/9 + 1/16 + 1/25 + … for 100 terms (1.6348839001848923)

  
*/

public class Pr5_2		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		double numerator = 1;
		double sum = 0;
		for (double firstDenominator = 1; firstDenominator <= 100; firstDenominator++) {
			double secondDenominator = firstDenominator;
			double term = 1 / (secondDenominator * firstDenominator);
			sum = sum + term;
		}
		IBIO.output(sum);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)
tracing tail recursion
1.6349839001848923
*/
