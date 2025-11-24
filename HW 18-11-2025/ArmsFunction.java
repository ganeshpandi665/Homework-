class ArmsFunction
{
	int arms(int num,int sum)
	{
	if(num==0)
	{
		return sum;
	}
	int rem = num%10;
	return arms(num/10,sum+(rem*rem*rem*rem));
	}
}