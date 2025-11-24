class FirstRepeatingMain
{
	public static void main(String[] args)
	{
		int ar[]={10,5,3,4,3,5,6};
		int target=8;
		
		FirstRepeatingFunction fr=new FirstRepeatingFunction();
		int res=fr.firstRepeat(ar,target);
		System.out.println(res+" is the first repeating element");
		
	}
}