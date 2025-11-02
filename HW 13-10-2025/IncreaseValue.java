class IncreaseValue
{
	public static void main(String [] args)
	{
		int value = 670;
		int percentage = 30;
		
		float increaseValue = ((float)percentage/(float)100)*(float)value;
		float totalValue = increaseValue + value;
		
		System.out.println(value+"%"+percentage+"="+increaseValue);
		System.out.println(increaseValue+"+"+value+"="+totalValue);
	}
}