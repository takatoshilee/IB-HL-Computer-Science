public class Q1TestFactorialWhile
{
	
	public static void main (String[] args)
	{
		IBIO.output("My Name");
		int number;
		do
		{
			number = IBIO.inputInt("Enter an integer between 0 and 20: ");
			if(number < 0 || number > 20)
			{	IBIO.output("Error-number out of range. Bye!");
				break; // exits from a loop, in this case--the do-while loop
			}
			long factorial = 1;
			IBIO.out( number + "! = ");
			if(number > 1) // do we need to calculate anything? (we know 0!=1; 1!=1)
			{
				for(int i = number; i > 0; i--)
				{	factorial = factorial * i;
					if(number <= 10) // do we need to output factors?
					{
						IBIO.out( i );
						if(i > 1)
						{	IBIO.out(" x ");
						}
					}
				}
			}
			if(number <= 10 && number > 1) // add an = after factors
			{	IBIO.out(" = ");
			}
			IBIO.out( factorial );
			int digits = 0;
			long result = factorial;
			while(result > 0)
			{	result = result/10;
				digits++;
			}
			IBIO.output("    Digits: " + digits);
		} 
		while(number >= 0 || number <= 20);
	}
}

