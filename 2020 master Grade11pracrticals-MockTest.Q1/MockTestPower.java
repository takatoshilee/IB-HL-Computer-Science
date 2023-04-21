/* 
 * 
 * Teacher Marcos' suggested answer to
 * the 'x to the power of y' mock test
 * 
 */
public class MockTestPower
{
	public static void main(String[] args)
	{
		int power;
		int base;
		int exponent;
		double negativePower;

		IBIO.output("Marcos Drien");
		do
		{
			power = 1;
			IBIO.output("\nX to the power of Y");
			IBIO.output("===================\n");
			base = IBIO.inputInt("Enter the base     = ");
			if( base != 0 )
			{
				exponent = IBIO.inputInt("Enter the exponent = ");
				IBIO.out( "\n" + base + " to the power of " + exponent + " = " );

				if( exponent < 0 )			// NEGATIVE EXPONENT
				{	exponent = exponent * -1;
					for(int i = 0; i < exponent; i++)
					{	power = power * base;
					}
					negativePower = 1.0/ power;
					String denominator = base + "^" + exponent;
					int denominatorLength = denominator.length(); // how many characters in the denominator of fraction
					IBIO.output("\n"); // go to next-next line
					for(int i = 1; i <= denominatorLength/2; i++) // put spaces...
					{	IBIO.out(" "); // ...before the "1"
					}
					IBIO.output("1");
					for(int i = 1; i <= denominatorLength; i++) // put line...
					{	IBIO.out("-");   // ...under the "1"
					}
					IBIO.output(" = ");  // add the "=" and go to next line
					IBIO.output(denominator);

					denominatorLength = 0; // lines 41~45: another way to count digits
					for(int i = power; i > 0; i=i/10)
					{	denominatorLength++;
					}
					IBIO.output("\n"); // go to next-next line
					for(int i = 1; i <= denominatorLength/2; i++) // put spaces...
					{	IBIO.out(" "); // ...before the "1"
					}
					IBIO.output("1");
					for(int i = 1; i <= denominatorLength; i++) // put line...
					{	IBIO.out("-");   // ...under the "1"
					}
					IBIO.output(" = " + negativePower);  // add the "=" and go to next line
					IBIO.output(power);

				}		// end if --> exponent is negative.
				else	// this could also be: if(exponent >= 0)
				{
					for(int i = 0; i < exponent; i++)
					{	power = power * base;
					}
					IBIO.output( power );
				} // end else
			}
			else		// this could also be: if(base == 0)
			{
				IBIO.output("Base is zero. Nothing to do.");
			}
		} while( base != 0 );

		IBIO.output("\n>Program end.\n"); // "\n" = go to next line
	}
}
