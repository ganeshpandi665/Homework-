class Library
{
	public static void main(String [] args)
	{
		int totalBooks = 1800;
		int percentgeOfMathsBooks = 40;
		int percentgeOfEnglishBooks = 20;
		int percentgeOfScienceBooks = 30;
		int percentgeOfSocialBooks = 10;
		
		int mathsBooks = totalBooks * percentgeOfMathsBooks/100; 
		int englisBooks = totalBooks * percentgeOfEnglishBooks/100; 
		int scienceBooks = totalBooks * percentgeOfScienceBooks/100; 
		int socialBooks = totalBooks * percentgeOfSocialBooks/100; 
		
		System.out.println("Number of Maths Books ="+" "+mathsBooks);
		System.out.println("Number of English Books ="+" "+englisBooks);
		System.out.println("Number of Science Books ="+" "+scienceBooks);
		System.out.println("Number of Social Books ="+" "+socialBooks);
	}
}