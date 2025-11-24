class ArmstrongMain
{
	public static void main(String [] args)
	{
		int num = 1634;
		ArmsFunction af = new ArmsFunction();
		int res = af.arms(num,0);
		if(res==num)
		{
			System.out.println(res+" is a Armstrong Number");
		}
		else
		{
			System.out.println(res+" is not a Armstrong Number");
		}
	}
}