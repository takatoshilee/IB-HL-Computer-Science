/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/
import java.util.Scanner;

public class test2methods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Taka");
		int min = 0, max = 0, primeCount = 0, count = 0;
		double sum = 0;
		int n;
		
		do {
			System.out.print("Enter a number: ");
			n = Integer.valueOf(scanner.nextLine());
			
			if (n > 0) {
				count++; //adds 1 to count
				sum = sum + n; //adds userNum to sum 
				
				//find prime numbers
				prime(n, primeCount);
				
								
				if (count == 1) {
					min = n;
					max = n;
				} else { //everytime a user inputs a number apart from the very first time, it checks if the number is smaller than the current smallest number
					if (n < min)
						min = n;
					if (n > max)
						max = n;
				}
			} else {
				System.out.println("Input Error.)"
		} while (n > 0);
		
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
		System.out.println("Average = " + sum / count);
		System.out.println("Prime frequency = " + prime(n, primeCount));
	}
	
	public static int prime(int n, int primeCount) {
		int divisor = 1;
		do {
			divisor++;
		} while (n % divisor != 0);
		
		if (n == divisor) { 
			primeCount++;
		}
		return primeCount;
	}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
