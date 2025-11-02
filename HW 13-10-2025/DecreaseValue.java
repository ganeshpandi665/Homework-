class DecreaseValue
{
	public static void main(String [] args)
	{
		int number = 1500;
		int percentage = 65;
		
		float decreaseValue = (float)number*((float)percentage/(float)100);
		float totalValue = number - decreaseValue;
		
		System.out.println(number+"%"+percentage+"="+decreaseValue);
		System.out.println(number+"-"+decreaseValue+"="+totalValue);
		
	}
}