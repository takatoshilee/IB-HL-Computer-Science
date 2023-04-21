/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr1_3		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int x = IBIO.inputInt("Enter starting number: ");
		int y = IBIO.inputInt("Enter number of steps: ");
		int z = IBIO.inputInt("Enter increment value: ");
		IBIO.out("The sequence is: ");
		for (int a = x; a <= x+y*z; a = a + z)
		{
			IBIO.out(a + ", ");
			IBIO.output(a*a + ", ");
			IBIO.output (a*a*a + ", ");
		}
		}
	}
}


/*

how to get rid of the , at the end?	
*/
