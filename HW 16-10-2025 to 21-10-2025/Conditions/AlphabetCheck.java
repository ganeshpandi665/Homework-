import java.util.Scanner;
class AlphabetCheck
{
	public static void main(String [] args)
	{
		Scanner letter = new Scanner(System.in);
		System.out.println("Enter the Character");
		char character = letter.next().charAt(0);
		
		if((character>='A' && character<='Z') || (character>='a' && character<='z'))
		{
			System.out.println(character+" "+"is an alphabet");
		}
		else
		{
			System.out.println(character+" "+"is not an alphabet");
		}
	}
}
