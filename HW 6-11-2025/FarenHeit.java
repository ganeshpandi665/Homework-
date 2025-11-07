class FarenHeit
{
	public static void main(String [] args)
	{
		FarenHeit f = new FarenHeit();
		double res = f.celsiusToFarenheit(10);
		System.out.println(res);
	}
	double celsiusToFarenheit(int celciusValue)
	{
		double farenHeit = (celciusValue*9/5)+32;
		return farenHeit;
	}
}