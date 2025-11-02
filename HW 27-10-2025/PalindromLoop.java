class PalindromLoop
{
	public static void main(String[] args)
	{
		int a = 1221;
		int b = a;
		int rem = 0;
		int sum = 0;
		while(a>0)
		{
			rem=a%10;
			sum=rem+(sum*10);
			a=a/10;
		}
		if(b==sum)
		{
			System.out.println(b+" "+"is a Palindrome Number");
		}
		else
		{
			System.out.println(b+" "+"is not a Palindrome Number");
		}
	}
}