import java.util.Scanner;
class GradeEvoluation
{
	public static void main(String [] args)
	{
		Scanner grade = new Scanner(System.in);
		System.out.println("Enter the Grade");
	    char studentGrade = grade.next().charAt(0);
		
		switch(studentGrade)
		{
			case 'A':
			System.out.println("Better");
			break;
			
			case 'B':
			System.out.println("Best");
			break;
			
			case 'C':
			System.out.println("Good");
			break;
			
			case 'D':
			System.out.println("Average");
			break;
			
			case 'E':
			System.out.println("Below Average");
			break;
			
			case 'F':
			System.out.println("Fail");
			break;
			
			default:
			System.out.println("Not eligible");
			break;
		}
	}
}