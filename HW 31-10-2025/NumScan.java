import java.util.Scanner;
class NumScan
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int len = sc.nextInt();
		
		int arr[] = new int [len];
		
	    for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter the index value "+i+" :");
			arr[i] = sc.nextInt();
			
		}
		System.out.println(" ");
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("The "+i+" index value of Array is :"+arr[i]);
		}
	}
}