import java.util.Scanner;
public class ReverseN
{
	public static void main(String str[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = scan.nextInt();
		int temp = n;
		int rem, rev=0;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		System.out.println("Reverse: "+rev);
	}
}
