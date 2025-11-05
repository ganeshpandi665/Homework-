class OddEven
{
	public static void main(String [] args)
	{
		int ar[] = {13,6,25,12,7,14,32,17};
		int evensum = 0;
		int evencount = 0;
		int oddsum = 0;
		int oddcount = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				evensum = ar[i]+evensum;
				evencount++;
			}
			else
			{
				oddsum = ar[i]+oddsum;
				oddcount++;
			}
		}
		System.out.println("Sum of Even Number : "+evensum);
		System.out.println("Even Count is : "+evencount);
		System.out.println("Sum of Odd Number : "+oddsum);
		System.out.println("Odd Count is : "+oddcount);
		
	}
}