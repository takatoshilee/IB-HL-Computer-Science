/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr6_1		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int num = IBIO.inputInt("enter a number of lines ");
		String aa = stars(num);
		
		for (int i = 0; i < num; i++)
			System.out.println(aa);
	}
	public static String stars(int num) 
	{
		String xx = "          ";
		for (int i = 0; i < num; i++)
			xx = xx + "*";
		return xx;
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
