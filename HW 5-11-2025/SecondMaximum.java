class SecondMaximum
{
	public static void main(String [] args)
	{
		int ar[] = {28,16,13,7,15,23,2};
	    int max = 0;
		int max2 = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max = ar[i];
			}
		}
		System.out.println("First Maximum Value : "+max);
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max2 && ar[i]<max)
			{
				max2 = ar[i];
			}
		}
		System.out.println("Second Maximum Value : "+max2);
	}
}