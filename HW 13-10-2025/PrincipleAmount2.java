class PrincipleAmount2
{
	public static void main(String [] args)
	{
		int simpleInterest = 3600;
		int rateOfInterest = 6;
		int timeInYears = 3;
		
		int principleAmount = (simpleInterest*100)/(rateOfInterest*timeInYears);
		
		System.out.println("Principle Amount = "+principleAmount);
	}
}