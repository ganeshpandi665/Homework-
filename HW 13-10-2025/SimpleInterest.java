class SimpleInterest
{
	public static void main(String [] args)
	{
		int pricipleAmount = 5000;
		int rateOfInterest = 5;
		int timeInYears = 2;
		
		int simpleInterest = pricipleAmount*rateOfInterest*timeInYears/100;
		
		System.out.println("Simple Interest ="+" "+simpleInterest);
	}
}