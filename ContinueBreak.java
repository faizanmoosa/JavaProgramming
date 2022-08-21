class ContinueBreak
{
	public static void main(String args[])
	{
		int n=3000;
		for(int i=1;i<31;i++)
		{
			if(i%2==0)
			continue;
			System.out.println("Go out since date = "+i);
			System.out.println("Amount = "+n);
			n-=300;
			if(n<=0)
			break;
		}
	}
}
