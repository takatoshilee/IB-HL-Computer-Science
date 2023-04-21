/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

import java.util.Scanner;

public class Pr6_3		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = Integer.valueOf(scanner.nextLine());
		for (int count = 0; count < (2 * num) + 1; count++) {
			System.out.println(stars(num));
		}
		
	}
	public static String stars(int num) {
		String stars = "";
		
		while (num >= 0) {
			stars = stars + "* ";
			num--;
		}	
		return stars;
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
