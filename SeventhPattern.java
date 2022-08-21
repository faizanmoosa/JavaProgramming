class SeventhPattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
				System.out.print("*");
			int count=8-i*2;
			for(int k=1;k<=count;k++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
				System.out.print("*");
			int count=8-i*2;
			for(int k=1;k<=count;k++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
