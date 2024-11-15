import java.util.Scanner;	
class Volume
{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius");
		double radius = sc.nextDouble();

		System.out.println("Enter the height");
		double height = sc.nextDouble();

		final double pi = 3.14;
		
		double area = pi*radius*radius;
		System.out.println("the area of cylinder:"+area);

		double volume = area*height;
		System.out.println("the Volume of cylinder:"+volume);

	}

}