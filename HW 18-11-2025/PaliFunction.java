class PaliFunction
{
	int palindrom(int num,int sum)
	{
		if(num==0)
		{
			return sum;
		}
		int rem = num%10;
		return palindrom(num/10,sum*10+rem);
	}
}