import java.util.Scanner;
class TrafficLight
{
	public static void main(String [] args)
	{
		Scanner light = new Scanner(System.in);
		System.out.println("Enter the Traffic light color");
		String trafficLight = light.next();
		
		switch(trafficLight)
		{
			case "Red":
			System.out.println("Stop");
			break;
			
			case "Yellow":
			System.out.println("Get Ready");
			break;
			
			case "Green":
			System.out.println("Go");
			break;
		}
			
		
		
	}
}














































