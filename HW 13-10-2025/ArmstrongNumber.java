class ArmstrongNumber
{
	public static void main(String [] args)
	{
		int a = 371;
		int b = a;
		
		int c = a%10;
		int d = a/10;
		int e = d%10;
		int f = d/10;
		
		int g = (c*c*c)+(e*e*e)+(f*f*f);
		
		boolean h = (a==g);
		
		System.out.println(h);
	}
}