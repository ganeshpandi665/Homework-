class MinimumMain
{
	public static void main(String [] args)
	{
		int ar[] = {2,25,33,12,4,56,8,9};
		int min = ar[0];
		int i = 0;
		MinimumFun mf = new MinimumFun();
		int res = mf.findMin(ar,min,++i);
		System.out.println("Minimum value is :"+res);
		
		
	}
}