/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/
import java.util.Scanner;

public class StatisticsJavaTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Taka");
		
		int min = 0, max = 0, count = 0, even = 0, odd = 0;
		int sum = 0;
		int n;
		
		while (true) {
			System.out.print("How many numbers to process? ");
			count = Integer.valueOf(scanner.nextLine());
			
			if (count < 3) {
				System.out.println("Input Error.");
			} 
			
			if (count <= 2) {
				continue;
			}	
			break;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print("Enter number: ");
			int number = Integer.valueOf(scanner.nextLine());
			
			sum = sum + number;	
			
			if (i == 0) {	
				max = number;	
				min = number;
			}
			
			if (number < min) {	
				min = number;
			}
			
			if (number > max) {	
				max = number;
			}
			
			if (number % 2 == 0) {
				even += 1;
			} else if (number % 2 == 1) {
				odd += 1;
			}
			
		}

		System.out.println("Minimum: " + min );
		System.out.println("Maximum: " + max );
		System.out.println("Range  : " + (max - min) );
		System.out.println("Average: " + ((double) sum / count) );
		System.out.println("Evens: " + even);
		System.out.println("Odds : " + odd);
		System.out.println("[End]");
	}
} 


/*

Taka
How many numbers to process? 7
Enter number: 7
Enter number: 5
Enter number: 3
Enter number: 2
Enter number: 8
Enter number: 9
Enter number: 6
Minimum: 2
Maximum: 9
Range  : 7
Average: 5.714285714285714
Evens: 3
Odds : 4
[End]
*/
