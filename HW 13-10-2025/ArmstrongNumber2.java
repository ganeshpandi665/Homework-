class ArmstrongNumber2
{
	public static void main(String [] args)
	{
		int a = 9474;
		int b = a;
		
		int c = a%10;
		int d = a/10;
		int e = d%10;
		int f = d/10;
		int g = f%10;
		int h = f/10;
		
		int i = (c*c*c*c)+(e*e*e*e)+(g*g*g*g)+(h*h*h*h);
		
		boolean j = (i==b);
		
		System.out.println(j);
		
	}
}