class School
{
	public static void main(String [] args)
	{
		int totalStudents = 50;
		int percentageOfGirls = 40;
		
		float girls = totalStudents*((float)percentageOfGirls/(float)100);
		float boys = totalStudents - girls;
		
		System.out.println("Number of Girls is :"+girls);
		System.out.println("Number of Boys is :"+boys);
		
			
	}
}