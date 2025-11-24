class ArraySumMain
{
	public static void main(String [] args)
	{
		int ar[] = {1,5,7,15,28,40};
		int sum = 0;
		int i = 0;
		
		ArraySumFun as = new ArraySumFun();
		int res = as.sumArray(ar,sum,i);
		System.out.println("Sum of Array is : "+res);
	}
}