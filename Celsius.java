import java.util.Scanner;	
class Celsius
{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree celsius");
		double degree = sc.nextDouble();

		double fahrenheit = (9.0/5)*degree+32;
		System.out.println("the conversion from celsius to fahrenheit is:"+fahrenheit);
		

	}

}