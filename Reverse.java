import java.util.Scanner;
class ReverseNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		
		int num = sc.nextInt();
		int rev = 0;
		int rem = num%10;
		rev = rev*10+rem;
		num = num/10;
		rem = num%10;
		rev = rev*10+rem;
		num = num/10;
		rem = num%10;
		rev = rev*10+rem;
		
		System.out.println("reverse number is :"+rev);
	}

}