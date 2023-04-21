/*

Pr 4.1 Write a program that will let you enter two numbers. Then it will ask you to enter “1” for add, “2” for
multiply, “3” for quit. This will be displayed on the screen like below:
* 
Press: [1] for addition
[2] for multiplication
[3] for quit

  
*/

public class Pr4_1		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
			int a = IBIO.inputInt("enter first number ");
			int b = IBIO.inputInt("enter second number ");
			int out;
			int num;
			do
			{
				do
				{
				num = IBIO.inputInt("Press:  [1] for addition\n\t[2] for multiplication\n\t[3] for quit \n");
				if (num != 1 && num != 2 && num != 3)
					IBIO.output("Error number was not in the specified range");
				}
				while (num != 1 && num != 2 && num != 3);
				switch (num)
				{	
					case 1:
						out = a + b;
						IBIO.output(out);
						break;
					case 2:
						out = a * b;
						IBIO.output(out);
						break;
					default:
						IBIO.output("u quit");
						break;
	
				}
				
			}
			while (num != 3);
			
	}
}


/*

Works
*/
