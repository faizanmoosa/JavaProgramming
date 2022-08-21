//Find if a Given Year is a Leap Year
package Java;
class LeapTest
{
    LeapTest(int x)
    {
        if(x%4==0)
            System.out.println("Leap Year : "+x);
        else
            System.out.println("Not a Leap Year : "+x);
    }
}
class LeapYear
{
    public static void main(String args[])
    {
        int y=2000, Y=2002;
        new LeapTest(y);
        new LeapTest(Y);
    }
}
