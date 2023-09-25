/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr10_2		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		String s = IBIO.input("Input binary number: ");
		char[] c = s.toCharArray();
		
		int sum = 0; 
		int adder = 1; 
		for(int i = c.length - 1; i >= 0; i--) {
			if(c[i] == '1') {
				sum += adder;
			}
			adder *= 2;
		}
		IBIO.out(sum);
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

fraction, 2 dimentional point in space

*/


