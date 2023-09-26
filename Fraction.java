/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/
import java.util.Scanner;


//public class Pr11_1		// Replace "Template"with your specific class name
//{
	//public static void main(String[] args)
	//{
		
	//}
//}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/


public class Fraction {
	private int num;
	private int den;
	
	Fraction(int a, int b) {
		num = a;
		den = b;
	}
	
	public static void main(String args[]) {
		Fraction f = new Fraction(num, den);
		IBIO.output(f.num + "/" + f.den);
		System.out.println(f);
	}

}

