class SingleElement
{
	public static void main(String[] args)
	{
		int ar[]={2,3,5,4,5,3,4};
		
		SingleFun sf=new SingleFun();
		int res=sf.element(ar);
		
		System.out.println(res+" is a non repeating element");
	}
}
