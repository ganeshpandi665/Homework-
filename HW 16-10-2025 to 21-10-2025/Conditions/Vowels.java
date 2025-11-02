import java.util.Scanner;
class Vowels
{
	public static void main(String [] args)
	{
		Scanner alphabet = new Scanner(System.in);
		System.out.println("Enter the letter ");
		char character  = alphabet.next().charAt(0);
		
		if(character == 'a' || character == 'A')
		{
			System.out.println(character+" "+"is a vowels");
		}
		else if(character == 'e' || character == 'E')
		{
			System.out.println(character+" "+"is a vowels");
		}
		else if(character == 'i' || character == 'I')
		{
			System.out.println(character+" "+"is a vowels");
		}
		else if(character == 'o' || character == 'O')
		{
			System.out.println(character+" "+"is a vowels");
		}
		else if(character == 'u' || character == 'U')
		{
			System.out.println(character+" "+"is a vowels");
		}
		else
		{
			System.out.println(character+" "+"is a consonant");
		}
		
	}	
		
}	
	