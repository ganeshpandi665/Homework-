import java.util.Scanner;
class MarksGrade
{
	public static void main(String [] args)
	{
		Scanner mark = new Scanner(System.in);
		System.out.println("Enter the Mark");
		int studentMarks = mark.nextInt();
		
		if(studentMarks>=91)
		{
			System.out.println("A grade");
		}
		else if(studentMarks>=71 && studentMarks<=90)
		{
			System.out.println("B grade");
		}
		else if(studentMarks>=51 && studentMarks<=70)
		{
			System.out.println("C grade");
		}
		else if(studentMarks>=25 && studentMarks<=50)
		{
			System.out.println("D grade");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}