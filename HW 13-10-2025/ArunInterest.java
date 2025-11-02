class ArunInterest
{
	public static void main(String [] args)
	{
		int principleAmount = 50000;
		int rateOfInterest = 6;
		int timeInYears = 5;
		
		int simpleInterest = principleAmount*rateOfInterest*timeInYears/100;
		
		System.out.println("Arun will earn his total balance is :"+" "+simpleInterest);
	}
}