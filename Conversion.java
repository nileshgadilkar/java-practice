import java.util.Scanner;	
class Conversion
{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the feet");
		double feet = sc.nextDouble();
		
		double meter = feet * 0.305;
		System.out.println(" feet into the meter"+meter);
	}

}