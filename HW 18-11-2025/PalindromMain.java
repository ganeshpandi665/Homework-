class PalindromMain
{
	public static void main(String [] args)
	{
		int num = 1551;
		PaliFunction pf = new PaliFunction();
		int res = pf.palindrom(num,0);
		if(res==num)
		{
			System.out.println(res+" is a Palindrom Number");
		}
		else
		{
			System.out.println(res+" is not a Palindrom Number");
		}
	}
}