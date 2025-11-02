import java.util.Scanner;
class Vowels
{
	public static void main(String [] args)
	{
		Scanner character = new Scanner(System.in);
		System.out.println("Enter the character");
		char letter = character.next().charAt(0);
		
		switch(letter)
		{
			case 'a':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'A':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'e':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'E':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'i':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'I':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'o':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'O':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'u':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			case 'U':
			System.out.println(letter+" "+"is a vowels");
			break;
			
			default:
			System.out.println(letter+" "+"is a consonents");
			break;
			
		}
	}
}