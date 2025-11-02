class NeonNumber9
{
	public static void main(String []args)
	{
		int a = 9;
		int b = a;
		
		int c = a*a;
		int d = c%10;
		int e = c/10;
		
		int f = (d+e);
		
		boolean g = (f==b);
		
		System.out.println(g);
	}
}