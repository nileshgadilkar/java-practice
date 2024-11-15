import java.util.Scanner;	
class Circle
{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius");
		double radius = sc.nextDouble();
		
		final double pi = 3.145;
		double perimeter = 2 * pi * radius;
		System.out.println("The perimeter of circle is:"+perimeter+"cm");
		double area = pi * radius * radius;
		System.out.println("The  Area of Circle is:"+area+"cm^2");
	}

}