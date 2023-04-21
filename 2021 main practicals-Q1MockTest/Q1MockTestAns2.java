public class Q1MockTestAns2 // more complex answ3er
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
		}
		if( howMany >= 3)
		{
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
			}
			// output of results: outside the for loop, we need them output only once
			
			IBIO.output( "Minimum = " + min );
			IBIO.output( "Maximum = " + max );
			IBIO.output( "Range   = " + (max-min) );
			IBIO.output( "Average = " + (sum/howMany) );
			
			int i; // this makes it possible to use I after the loop is over
			for( i = 2; i < max; i++) // checks whether the numbers 2..(max-1) are divisors of max
			{
				if(max % i == 0)
				{
					IBIO.output(max + " is not a prime");
				}
			}
			if(i == max)
			{	IBIO.output(max + " is a prime");
			}
		}
		//IBIO.output("[End]");
	}
}

