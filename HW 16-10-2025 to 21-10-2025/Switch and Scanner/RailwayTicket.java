import java.util.Scanner;
class RailwayTicket
{
	public static void main(String [] args)
	{
		Scanner ticket = new Scanner(System.in);
		System.out.println("select the seat type");
		System.out.println("1.General");
		System.out.println("2.Sleeper");
		System.out.println("3.AC 3 Tyre");
		System.out.println("4.AC 2 Tyre");
		System.out.println("5.First Class");
		
		int railwayTicket = ticket.nextInt();
		
		switch(railwayTicket)
		{
			case 1:
			System.out.println("General :Rs.2000");
			break;
			
			case 2:
			System.out.println("Sleeper :Rs.2500");
			break;
			
			case 3:
			System.out.println("AC 3 Tyre :Rs.3000");
			break;
			
			case 4:
			System.out.println("AC 2 Tyre :Rs.3500");
			break;
			
			case 5:
			System.out.println("First Class :Rs.4000");
			break;
			
			case 6:
			System.out.println("Rs.5000");
			break;
		}
	}
}