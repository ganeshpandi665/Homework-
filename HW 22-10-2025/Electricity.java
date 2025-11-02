import java.util.Scanner;
class Electricity
{
	public static void main(String [] args)
	{
		Scanner calculator = new Scanner(System.in);
		System.out.println("Enter the Unit: ");
		int unit = calculator.nextInt();
		
		if(unit>=0 && unit<=100)
		{
			System.out.println("Your Electricity Bill");
			System.out.println();
			System.out.println(unit*5);
			
		}
		else if(unit>=101 && unit<=200)
		{
			System.out.println("Enter Your Elctricity Bill");
			System.out.println();
			System.out.println(unit*7);
		}
		else
		{
			System.out.println("Enter Your Electricity Bill");
			System.out.println();
			System.out.println(unit*10);
		}
	}
}
	