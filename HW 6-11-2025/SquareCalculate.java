class SquareCalculate
{
	public static void main(String [] args)
	{
		SquareCalculate s = new SquareCalculate();
		int res = s.findSquare(10);
		System.out.println("The Square value is : "+res);
	}
	int findSquare(int num)
	{
		int square = num*num;
		return square;
	}
}