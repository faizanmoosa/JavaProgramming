//Largest of three Numbers
package Java;
public class LargestThree
{
    public static void main(String args[])
    {
        int a=7,b=20,c=56;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is Largest i.e., "+a);
            }
            else
            {
                System.out.println("c is Largest i.e., "+c);
            }
        }
        else if(b>c)
        {
            System.out.println("b is Largest i.e., "+b);
        }
        else
        {
            System.out.println("c is Largest i.e., "+c);
        }
    }
}
