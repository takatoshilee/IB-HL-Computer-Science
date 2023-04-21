/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/
/*
public class Pr1_6		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		int a = 0, b = 1; 
		int count = IBIO.inputInt("Enter your number");
		IBIO.out (a + " " + b);
		for (int c = 0; c <= count; c = a + b, a = b, b = c)
			IBIO.out(c + " ");
	}
}
*/
public class Pr1_6 {

    public static void main(String args[])
{
		int n1=0,n2=1,n3,i;
		int count = IBIO.inputInt("Enter count");
		IBIO.out(n1+" "+n2);//printing 0 and 1
		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
		{
			n3=n1+n2;
			//System.out.print(" "+n3);
			IBIO.out(" "+n3);
			n1=n2;
			n2=n3;
		}
}
}

/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
