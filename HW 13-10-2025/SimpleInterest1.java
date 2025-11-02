class SimpleInterest1
{
	public static void main(String [] args)
	{
		int principleAmount = 10000;
		int rateOfInterest = 5;
		int timeInYears = 3;
		
		int simpleInterest = principleAmount*rateOfInterest*timeInYears/100;
		
		System.out.println("Simple Interest ="+" "+simpleInterest);
	}
}