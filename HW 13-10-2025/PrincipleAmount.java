class PrincipleAmount
{
	public static void main(String [] args)
	{
		int simpleInterest = 2400;
		int rateOfInterest = 8;
		int timeInYears = 4;
		
		int principleAmount = (simpleInterest*100)/(rateOfInterest*timeInYears);
		
		System.out.println("Principle Amount = "+principleAmount);
	}
}