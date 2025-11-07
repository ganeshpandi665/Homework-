class FunctionInterest
{
	public static void main(String [] args)
	{
		FunctionInterest f = new FunctionInterest();
		int res =f.simpleInterest(5000,5,2);
		System.out.println("Simple Interest = "+res);
	}
	int simpleInterest(int principleAmount, int rateOfInterest, int timeInYears)
	{
		int si = (principleAmount*rateOfInterest*timeInYears)/100;
		return si;
	}
}