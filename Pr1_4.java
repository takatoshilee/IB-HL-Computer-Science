/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Pr1_4	
/*
{	// Replace "Template"with your specific class name     
    public static void main(String[] args) {
       int number = 9;
       int triangular = number * (number+1)/2;
       IBIO.output("Triangular Number for " + number + " is "+ triangular);
    }
}
*/
/*
{
	public static void main(String[] args)
	{

		for (int b = 1; a <= 100; a = (a*(a+1)/2))
		{
			IBIO.out(a + ", ");
		}
*/
{
	public static void main(String[] args) {
		
		 for (int i = 1; i <= 10; i++) {
            int triangular = 0;
            for (int j = 1; j <= i; j++) {
                triangular = triangular + j;
            }
				
				//a = i + triangular;
				int b;
				b = i + triangular;
				a = a + b.toString() + ",";
				//IBIO.output(i + triangular + ", ");
	}
					IBIO.output(a);
}
}


/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
