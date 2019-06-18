import java.util.Scanner;

public class Trianglearea {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		// declare the variables to hold the base and height
		double base;
		double height;
		
		System.out.println("Enter the triangle's base");
		base = sc.nextDouble();
		
		System.out.println("Enter the triangle's height");
		height = sc.nextDouble();
		
		double preArea = base * height;
		double Area = preArea / 2;
		
		System.out.println("The Area of triangle is: " + Area);
		
		
		
		
		
		
		
	}
	
}
