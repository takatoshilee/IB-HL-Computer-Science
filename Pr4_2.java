/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr4_2		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int x = 1; x <= 1000; x++) {
			int remainder = x % 3;
			switch (remainder)
			{
				case 0:
					sum = sum + x * -5;
					break;
				case 1:
					sum = sum + x * 7;
					break;
				case 2:
					sum = sum + x * 2;
					break;
				default:
					IBIO.output("u quit");
					break;
			}
		}
		IBIO.output(sum);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)
4.3 exit from nested loops
* 1 question that is like the question, something with doubles, not necessarily a sequence
* think more of patterns
*/
