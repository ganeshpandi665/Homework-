import java.util.Scanner;
class Citizen
{
	public static void main(String [] args)
	{
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age :");
		int personAge = age.nextInt();
		if(personAge>=60 && personAge<=80)
		{
			System.out.println("Senior Citizen");
		}
		else
		{
			System.out.println("Not a Senior Citizen");
		}
	}
}