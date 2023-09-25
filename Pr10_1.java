/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr10_1		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		String s = IBIO.input("Input a word: ");
		char[] c = s.toCharArray();
		
		for(int i = 0 ; i < s.length(); i++) {
			IBIO.out(c[i]);
		}
		IBIO.output("");
		
		for(int i = s.length() - 1; i >= 0; i--) {
			IBIO.out(c[i]);
		}
		IBIO.output("");
		
		for(int i = 0 ; i < s.length(); i++) {
			IBIO.out(c[i]);
		}
		for(int i = s.length() - 2; i >= 0; i--) {
			IBIO.out(c[i]);
		}
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
