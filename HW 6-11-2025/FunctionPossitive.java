class FunctionPossitive
{
	public static void main(String [] args)
	{
		int ar[]={12,18,-2,-36,45,-21,1};
		FunctionPossitive f = new FunctionPossitive();
		int res = f.checkPossitive(ar);
		System.out.println("Possitive Numbers : "+res);
		int res2 = f.checkNegative(ar);
		System.out.println("Negative Numbers : "+res2);
	}
	int checkPossitive(int arr[])
	{
		int possitiveNumber=0;
		for(int i=0;i<arr.length;i++)
		{
			if(0<arr[i])
			{
				possitiveNumber =arr[i];
			}
		}
		return possitiveNumber;
	}
	int checkNegative(int arr[])
	{
		int negativeNumber=0;
		for(int i=0;i<arr.length;i++)
		{
			if(0>arr[i])
			{
				negativeNumber =arr[i];
			}
		}
		return negativeNumber;
	}
}