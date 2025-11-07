class SecondMaxMin
{
	public static void main(String [] args)
	{
	int ar[] = {12,7,2,5,22,18,32};
	SecondMaxMin s = new SecondMaxMin();
	int res = s.secondMax(ar);
	System.out.println("Second Maximum Value : "+res);
	int res2 = s.secondMin(ar);
	System.out.println("Second Minimum value : "+res2);
	
	}
	int secondMax(int arr[])
	{
		int max =arr[0];
		int max2 =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
	    }
		System.out.println("First Maximum Value is : "+max);
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>max2) && (arr[i]<max))
			{
				max2 = arr[i];
			}
		}
		return max2;
	}
	int secondMin(int arr[])
	{
		int min = arr[0];
		int min2 = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("First Minimum Value : "+min);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min2 && arr[i]>min)
			{
				min2 = arr[i];
			}
		}
		return min2;
	}
}