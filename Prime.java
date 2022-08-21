//Display All Prime Numbers from 1 to N
package Java;
public class Prime
{
    public static void main(String args[])
    {
        int n=11;
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
