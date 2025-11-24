class MaxMain
{
	public static void main(String [] args)
	{
		int ar[]={2,34,66,47,87,13,59};
		int max = 0;
		int i = 0;
		
	    MaxFun mf = new MaxFun();
	    int res = mf.findMax(ar,max,i);
		System.out.println("Maximum value is : "+res);
		
	}
}