import java.util.Scanner;
class Tipcalculation
{
	public static void main ( String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total amount");
		double  totalAmount = sc.nextDouble();

		System.out.println("Enter the Tip rate");
		double tipRate = sc.nextDouble();

		double tip = totalAmount*tipRate/100;
		System.out.println("the Tip is:"+tip);

		double total = totalAmount+tip;
		System.out.println("The total amount is:"+total);
		
		

	
	}

}