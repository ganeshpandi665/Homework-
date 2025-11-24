class Insertion
{
	public static void main(String [] args)
	{
	   int ar[] = {10,20,30,40,50};
	   int pos = 3;
	   int value = 99;
	   System.out.println("Before Insert");
        for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}			
		System.out.println();
		System.out.println("After Insert");
		Insertion is = new Insertion();
		int res[] = is.insert(ar,pos,value);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+", ");
		}
	}
	int[] insert(int ar[],int pos,int value)
	{
		int br[] = new int[ar.length+1];
		for(int i=0;i<pos-1;i++)
		{
			br[i]=ar[i];
		}
		br[pos-1]=value;
		for(int i =pos;i<br.length;i++)
		{
			br[i]=ar[i-1];
		}
		return br;
	}
}