class ArmstrongTest
{
    ArmstrongTest(int x)
    {
        int n=x;
        double arm=0,c=0;
        while(x>0)
        {
            x/=10;
            c++;
        }
	x=n;
        while(x>0)
        {
            double rem=x%10;
            arm=Math.pow(rem,c)+arm;
            x/=10;
        }
        x=(int)arm;
        if(n==x)
        System.out.println(n);
    }
}
class Armstrong
{
    public static void main(String args[])
    {
        int n1=100, n2=200;
        while(n1<=n2)
        {
            new ArmstrongTest(n1);
            n1++;
        }
    }
}
