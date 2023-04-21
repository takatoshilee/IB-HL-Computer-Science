public class Q1MockTestAns1
{
	
	public static void main (String[] args) 
	{
		IBIO.output("Marcos Drien");
		int max = 0;
		int min = 0;
		double sum = 0;
		int howMany = IBIO.inputInt("How many numbers to process? ");
		if(howMany < 3)
		{	IBIO.output("Input error");
			System.exit(1); // stop the program; exit
		}

		for(int i = 0; i < howMany; i++) // repeat <howMany> times
		{
			int number = IBIO.inputInt("Enter a number: ");
			sum = sum + number;	// add the number to sum, to calculate the average later
			IBIO.output(">>> SUM = " + sum);
			if(i == 0) // the first time the loop runs, i is 0
			{	max = number;	// we set the maximum to be the first number we input
				min = number;
			}
			if(number < min)	// update the minimum if a new larger number is input
			{	min = number;
			}
			if(number > max)	// update the maximum if a new larger number is input
			{	max = number;
			}
			// and then some more code...
			//IBIO.output("This repeats");
		}
		// output of results: outside the for loop, we need them output only once
		//IBIO.output("This does not repeat");
		IBIO.output( "Minimum = " + min );
		IBIO.output( "Maximum = " + max );
		IBIO.output( "Range   = " + (max-min) );
		IBIO.output( "Average = " + (sum/howMany) );
		
		for( int i = 2; i < max; i++) // checks whether the numbers 2..(max-1) are divisors of max
		{
			if(max % i == 0)
			{
				IBIO.output(max + " is not a prime");
				System.exit(0); // exit the program
			}
		}
		// this runs only if the for loop above does not find a divisor of max (between 2 and max-1)
		IBIO.output(max + " is a prime");
		
	}
}

