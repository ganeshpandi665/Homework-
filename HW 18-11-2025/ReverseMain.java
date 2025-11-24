class ReverseMain
{
	public static void main(String [] args)
	{
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		int i = ar.length-1;
		
		ReverseFun rf = new ReverseFun();
		rf.reverse(ar,i);
		
	}
}