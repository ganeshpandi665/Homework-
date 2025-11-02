class ArmstrongLoop
{
	public static void main(String[] args)
	{
		int a = 1634;
		int b = a;
		int rem = 0;
		int sum = 0;
		while(a>0)
		{
			rem = a%10;
			sum = sum+(rem*rem*rem*rem);
			a = a/10;
		}
		if(b==sum)
		{
			System.out.println(b+" "+"is an Armstrong Number");
		}
		else
		{
			System.out.println(b+" "+"is not an Armstrong Number");
		}
	}
}