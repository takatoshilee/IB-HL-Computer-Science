
public class Test2
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int n = IBIO.inputInt("Enter a number: ");
		while(n < 1 || n > 9)
		{	if(n < 1)
			{	IBIO.output("Error-  n >= 1");
			}
			if(n > 9)
			{	IBIO.output("Error-  n < 10");
			}
			n = IBIO.inputInt("Enter a number: ");
		}

		for(int i = 1; i <= n; i++)
		{
			IBIO.out(i + " ");
			int square = i * i;
			if(square < 10)
			{	IBIO.out(" ");
			}
			IBIO.out(square + " ");
			int power = 1;
			for(int j = 1; j <= i; j++)
			{	power = n * power;
			}
			
			int digits = 0;
			int number = power;
			do
			{	number = number / 10;
				digits++;
			} while(number > 0);
			for(int k = 0; k < 9-digits; k++)
			{	IBIO.out(" ");
			}
			IBIO.output(power);
		}
	}
}

