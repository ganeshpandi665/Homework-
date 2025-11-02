import java.util.Scanner;
class AreaCalculator
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Choose a Shape to Calculate its area");
		System.out.println("1. Square");
		System.out.println("2. Circle");
		System.out.println("3. Rectangle");
		System.out.println("4. Triangle");
		int shape=Sc.nextInt();
		
		switch(shape)
		{
			case 1:
			System.out.println("Enter Side of the Square");
			double side =Sc.nextDouble();
			double squareArea = side*side;
			System.out.println("Area of the Square:"+" "+squareArea);
			break;
			
			case 2:
			System.out.println("Enter radius of the Circle");
			double radius =Sc.nextDouble();
			double circleArea = radius*radius;
			System.out.println("Area of the Circle:"+" "+circleArea);
			break;
			
			case 3:
			System.out.println("Enter length of the rectangle");
			double length=Sc.nextDouble();
			System.out.println("Enter width of the rectangle");
			double width=Sc.nextDouble();
			double rectangleArea = length*width;
			System.out.println("Area of the Rectangle:"+" "+rectangleArea);
			break;
			
			case 4:
			System.out.println("Enter height of the triangle");
			double height=Sc.nextDouble();
			System.out.println("Enter base of the triangle");
			double base=Sc.nextDouble();
			double triangleArea= base*height;
			System.out.println("Area of the Triangle:"+" "+triangleArea);
			break;
			
			default:
			System.out.println("Invalid Area");
			
		}
	}
}