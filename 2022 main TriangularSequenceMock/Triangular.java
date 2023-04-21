/*
 * Triangular sequence mock test Q1 IB CS SL
 */


public class Triangular
{
	
	public static void main (String[] args)
	{
		IBIO.output("\nTRIANGULAR SEQUENCE\n");
		IBIO.output("Mi nombre es Juan Perez");
		int howMany ;
		do
		{
			howMany	= IBIO.inputInt("How many terms? ");
			while(howMany < 0)
			{
				IBIO.output("Error! positives only!");
				howMany = IBIO.inputInt("Terms? ");
			}
			if(howMany != 0)
			{
				int term = 0;
				double average = 0;
				for(int i = 1; i <= howMany; i++)
				{
					term = term + i;
					average = average + term;
					if(howMany <= 20)
					{	IBIO.out(term);
						if(i < howMany)
						{	IBIO.out(", ");
						}
					}
				}
				if(howMany > 20)
				{	IBIO.output(term);
				} else {
					IBIO.output("");
				}
				average = average / howMany;
				IBIO.output( "Average = " + average );
				int n = term;
				int digitsCounter = 0;
				do
				{	n = n / 10;
					digitsCounter = digitsCounter + 1;
				} while( n > 0 );
				IBIO.output(term + " has " + digitsCounter + " digits");
				IBIO.output(""); // leaves an empty line
			}
		} while(howMany != 0);
	}
}

