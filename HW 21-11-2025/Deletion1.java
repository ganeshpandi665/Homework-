class Deletion1
{
	public static void main(String [] args)
	{
		int ar[] =  {7, 14, 21, 28, 35};
		int value = 21;
		Deletion1 d = new Deletion1();
		int[] res = d.delete(ar,value);
		for(int i = 0;i<res.length;i++)
		{
			System.out.print(res[i]+", ");
		}
		
	}
	int[] delete(int ar[],int value)
	{
		int br[] = new int[ar.length-1];
		for(int i = 0;i<br.length;i++)
		{
			if(ar[i]==value)
			{
				br[i]=ar[i+1];
				br[i]=ar[i];
			}
		}
		
		return br;
	}
}