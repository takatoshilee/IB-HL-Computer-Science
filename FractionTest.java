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


public class FractionTest {
	private Fraction fraction = new Fraction();
	public static void main(String args[]) {
		Fraction f = new Fraction();
		f.enter();
		System.out.println(f);
		
		Fraction a = new Fraction();
		a.enter();
		Fraction b = new Fraction();
		b.enter();
		Fraction c = new Fraction();
		c = a.add(b);
		System.out.println(c);
	}
	
	public void enter() {
		String strFraction = IBIO.input("Enter fraction (a/b format): ");
		strFraction = strFraction.replace("/", " ");
		Scanner parse = new Scanner(strFraction);
		num = parse.nextInt();
		den = parse.nextInt();
		//this.simplify();
	}
	
	
}



