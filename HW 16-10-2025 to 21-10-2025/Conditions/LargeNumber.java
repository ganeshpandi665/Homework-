import java.util.Scanner;
class LargeNumber
{
	public static void main(String [] args)
	{
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber = number.nextInt();
		
		Scanner number2 = new Scanner(System.in);
		System.out.println("Enter the Second Number");
		int secondNumber = number.nextInt();
		
		if(firstNumber>secondNumber)
		{
			System.out.println(firstNumber+" "+"is a largest number");
		}
		else if(secondNumber>firstNumber)
		{
			System.out.println(secondNumber+" "+"is a largest number ");
		}
		
	}
}