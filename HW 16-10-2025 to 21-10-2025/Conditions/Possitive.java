import java.util.Scanner;
class Possitive
{
	public static void main(String [] args)
	{
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = number.nextInt();
		if(num>0)
		{
			System.out.println(num+" "+"is a possitive number");
		}
		else if(num<0)
		{
			System.out.println(num+" "+"is a negative number");
		}
		else
		{
			System.out.println(num+" "+"is a neutral number");
		}
		
    }
	
}	
	