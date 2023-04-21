
public class Test
{
	
	public static void main (String[] args)
	{
		IBIO.output("James Bond");
		int n;
		do
		{
			n = IBIO.inputInt("n = ");
			if(n == 0)
			{	break;
			}
			double average = 0;
			while(n < 0)
			{	IBIO.output("n must be +!");
				n = IBIO.inputInt("n = ");
			}
			int term = 0;
			for(int i = 1; i <= n; i++)
			{	term = term + i;
				average = average + term;
				if(n < 20)
				{
					IBIO.out(term);
					if(i < n)
					{	IBIO.out(", ");
					}
				}
			}
			if(n >= 20)
			{	IBIO.output(term);
			}
			IBIO.output("");
			IBIO.output("Average = " + average/n);
			int digitCounter = 0;
			int x = term;
			do
			{	x = x / 10;
				digitCounter++;
			} while( x > 0 );
			IBIO.output( term + " has " + digitCounter + " digits.");
		} while(n != 0);
	}
}

