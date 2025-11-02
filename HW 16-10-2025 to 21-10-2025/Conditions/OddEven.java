import java.util.Scanner;
class OddEven
{
	public static void main(String [] args)
	{
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = number.nextInt();
		
		if(num%2 == 0)
		{
		System.out.println(num+" "+"is a even number");	
		}
		else if(num%2 == 1)
		{
			System.out.println(num+" "+"is a odd number");
		}
	}
}
	