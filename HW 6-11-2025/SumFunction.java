class SumFunction
{
	public static void main(String [] args)
	{
		int ar[] = {13,26,5,20,13,7};
		SumFunction s = new SumFunction();
		int res = s.add(ar);
	    System.out.println("Sum Value Is : "+res);
		
	}
	int add(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = arr[i]+sum;
		}
		return sum;
	}
}