class MissingNumber
{
	public static void main(String[] args)
	{
		int ar[]={1,2,4,6,3,7,8};
		
		MissingNumber mn=new MissingNumber();
		mn.missing(ar);	
	}
	void missing(int ar[])
	{
		int n=ar.length+1;

	    int total=n*(n+1)/2;

		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		int missingNum=total-sum;
		System.out.println("Missing Number is: "+missingNum);

	}
}