import java.util.Scanner;
class Loan
{
	public static void main(String [] args)
	{
		Scanner age = new Scanner(System.in);
		System.out.println("Enter the Age");
		int personAge = age.nextInt();
		
		Scanner salary = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int personSalary = salary.nextInt();
		
		if(personAge>=21 && personSalary>=25000)
		{
			System.out.println("You are eligible for loan");
		}
		else 
		{
			System.out.println("You are not eligible for loan");
		}
		
	}
	
}