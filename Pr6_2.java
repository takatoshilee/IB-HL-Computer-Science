/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr6_2		// Replace "Template"with your specific class name
{
	public static String starsUp(int n) {
		String stars = "";
		for (int i = 0; i <= n; i++)
			stars = stars + "*";
		return stars;
	}
	
	public static String starsDown(int n, int num) {
		String stars = "";
		for (int i = num; i > n; i--)
			stars = stars + "*";
		return stars;
	}
	
	public static void main(String[] args) {
		int num = IBIO.inputInt("enter number of lines ");
	
		for (int i = 0; i <= num; i++)
		{	IBIO.output(starsUp(i));
		}
		
		for (int i = 0; i <= num; i++)
		{	IBIO.output(starsDown(i, num));
		}
	}
}

/*
give boolean, make truth table
* stick to numbers and doubles
* ch 1, 2, 3, 5
* hint: be very careful with counting down
* q 6, 7 maybe uses while loops
* much harder than prev test
* fruitful functions = gives smth back
* main method that is calculated: calculates digits, now make a funciton that calculaters the fibonacci term, digits of a program
*/
