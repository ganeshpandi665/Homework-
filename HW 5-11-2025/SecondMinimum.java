class SecondMinimum
{
	public static void main(String [] args)
	{
		int ar[] = {28,16,13,7,15,23,2};
		int min1 = ar[0];
		int min2 = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min1)
			{
				min1 = ar[i];
			}
		}
		System.out.println("First Minimum Value : "+min1);
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min2 && ar[i]>min1)
			{
				min2 = ar[i];
			}
		}
		System.out.println("Second Minimum Value : "+min2);
	}
}