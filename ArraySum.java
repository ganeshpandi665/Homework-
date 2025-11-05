class ArraySum
{
	public static void main(String [] args)
	{
		int ar[] = {2,7,13,6,14,27,15,2};
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum = ar[i]+sum;
			System.out.println(sum);
		}
	}
}