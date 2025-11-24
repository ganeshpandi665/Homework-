class MaxFind
{
	public static void main(String [] args)
	{
		int ar[]={20,15};
		MaxFind m = new MaxFind();
		int res = m.findMaximum(ar);
		System.out.println("Maximum Value Is : "+res);
	}
	int findMaximum(int arr[])
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max = arr[i];
		}
		return max;
	}
	
}
