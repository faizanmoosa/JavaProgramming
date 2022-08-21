import java.util.*;
class PrimeN
{
	public static void main(String args[])
	{
		byte n1,n2;
		System.out.println("Enter range: ");
		Scanner s = new Scanner(System.in);
		n1=s.nextByte();
		n2=s.nextByte();
		while(n1<=n2)
		{
			int count=0;
			for(int j=1;j<=n1;j++)
			{
				if(n1%j==0)
				count++;
			}
			if(count==2)
			System.out.print(n1+"\t");
			n1++;
		}
	}
}
