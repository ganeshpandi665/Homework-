class Delete
{
	public static void main(String [] args)
	{
		int ar[] = {1,2,3,4,5};
		int pos = 4;
		System.out.println("Before Delete");
		for(int i = 0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		System.out.println("After Delete");
		Delete d = new Delete();
		int res[] = d.delete(ar,pos);
		for(int i=0;i<res.length;i++)
		{
		    System.out.print(res[i]+", ");
		}
	}
	int[] delete(int ar[],int pos)
	{
		int br[] = new int[ar.length-1];
		for(int i=0;i<pos-1;i++)
		{
			br[i]=ar[i];
		}
		for(int i = pos-1;i<br.length;i++)
		{
			br[i]=ar[i+1];
		}
		return br;
	}
}
			