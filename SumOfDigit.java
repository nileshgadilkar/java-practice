import java.util.Scanner;
class SumOfDigit
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int num = sc.nextInt();
		int sum = 0;
		int rem = num%10;
		sum = sum+rem;
		num = num/10;
		rem = num%10;
		sum=sum+rem;
		num = num/10;
		rem = num%10;
		sum = sum+rem;
		num = num/10;
		rem = num%10;
		sum = sum+rem;
		System.out.println("sum of the digit:"+sum);
	}

}