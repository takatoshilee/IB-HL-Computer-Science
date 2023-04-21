/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Squarepowertest		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		IBIO.output("Takatoshi Lee");//part 1
		int x = IBIO.inputInt("Enter a number: "); //part 2
		while (x < 1 || x > 9)
		{
			x = IBIO.inputInt("Enter a number less than 10: ");
			IBIO.output(">>> Error - invalid input");
		}
		for (int i = 1; i <= x; i++)
		{
			IBIO.out(i + " ");
			int square = i * i;
			if (square < 10)
			{
				IBIO.out(" ");
			}
			IBIO.out(square);
			int power = 1;
			for (int j = 1; j <= i; j++)
			{
				power = power * x;
			}
			int digits = 0;
			int number = power;
			while (number > 0)
			{
				number /= 10;
				digits++;
			}
			for (int k = 0; k < x-digits; k++)
			{
				IBIO.out(" ");
			}
			IBIO.output(power);
		}
	}
}
/*
				IBIO.out(" " + power);
			}
		}
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
*/


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)
align in a different way
easier calculation, more loops
* 6, 7, 8 is the same
exit is shown in the bottom



*/
