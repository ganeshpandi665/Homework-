class ReverseFun
{
	int reverse(int ar[],int i)
	{
		if(i<=0)
		{
			return ar[i];
		}
		System.out.print(ar[i]+", ");
		return reverse(ar,--i);
	}
}