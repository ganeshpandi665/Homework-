class FunctionSum
{
	public static void main(String [] args)
	{
		FunctionSum f = new FunctionSum();
		int res = f.sum(10,20);
		System.out.println("Sum of Two Value Is : "+res);
	}
	int sum(int a, int b)
	{
		int c =a+b;
		return c;
	}
}