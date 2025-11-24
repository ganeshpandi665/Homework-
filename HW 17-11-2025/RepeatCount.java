class RepeatCount
{
	public static void main(String[] args)
	{
		int ar[]={1,2,2,2,3,4};
		int target=2;
		
		RepeatCount rc=new RepeatCount();
		rc.count(ar);
		
	}
	void count(int ar[])
	{
		int repeatCount=0;
		for(int i=0;i<ar.length;i++)
		{
		   if(ar[i]==2)
		   {
			  repeatCount++;
		
		   }
		}
		System.out.println("The Repeat Count of 2 is: "+repeatCount);
	}
}