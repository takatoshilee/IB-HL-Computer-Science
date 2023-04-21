
public class Test
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int n = IBIO.inputInt("Enter a number: ");
		while(n < 1 || n > 9)
		{	IBIO.output("Error number < 1 or > 9");
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
			while(number > 0)
			{	number = number / 10;
				digits++;
			}
			for(int k = 0; k < 9-digits; k++)
			{	IBIO.out(" ");
			}
			IBIO.output(power);
		}
	}
}

