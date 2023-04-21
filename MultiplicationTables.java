/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class MultiplicationTables		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		//part 1
		IBIO.output("Takatoshi Lee");
		int number;
		do
		{
			number = IBIO.inputInt("Enter an integer between 1 and 9: ");
			if (number == 0)
				System.exit(1);
			if(number < 1 || number > 9)
			{	
				IBIO.output("Error-number out of range. Try again");
			}
		}
		while (number < 1 || number > 9);
		for (int j = 1; j <= number; j++)
		{
			for(int i = 1; i <= 20; i++)
			{
				IBIO.out(j);
				IBIO.out(" x ");
				if (i < 10)
				{
					IBIO.out(" ");
				}
				IBIO.out(i);
				IBIO.out(" = ");
				long ans = i*j;
				if (ans < 100)
				{
					IBIO.out(" ");
				}
				if (ans < 10)
				{
					IBIO.out(" ");
				}
				
				IBIO.out(ans);
				IBIO.output("");
			}
			IBIO.output("------------");//i just added this to make it more clear
		}

	}	
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
