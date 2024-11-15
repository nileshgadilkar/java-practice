import java.util.Scanner;	
class Pound
{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pound");
		double pound = sc.nextDouble();
		
		double kilogram = pound * 0.454;
		System.out.println("conversion of pound to kilogram  is:"+ kilogram + "KG");
	}

}