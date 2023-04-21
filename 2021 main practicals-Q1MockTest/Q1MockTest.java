public class Q1MockTest
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
			//System.exit(1);
		}
		if(howMany >= 3)	// if not using System.exit(), use another if statement
		{
			for(int i = 0; i < howMany; i++) // repeat <howMany> times
			{
				int number = IBIO.inputInt("Enter a number: ");
				sum = sum + number;	// add the number to sum, to calculate the average later
				if(i == 0) // the first time the loop runs, i is 0
				{	max = number;	// we set the maximum to be the first number we input
				}
				if(number > max)	// update the maximum if a new larger number is input
				{	max = number;
				}
				// and then some more code...
			}
			// output of results: outside the for loop, we need them output only once
			
			IBIO.output( "Maximum = " + max );
			IBIO.output( "Average = " + (sum/howMany) );
		}
		
		
		IBIO.output("[End]"); // outside the loop, happens only once at the end of the program
	}
}

