class NinthPattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int b = (i%2==0) ? 0 : 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b+"\t");
				b = (b==1) ? 0 : 1;
			}
			System.out.println();
		}
	}
}
