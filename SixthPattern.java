class SixthPattern
{
	public static void main(String args[])
	{
		int count=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}
}
