package Java;
class DataTypes
{
    public static void main(String args[])
    {
        boolean b=true;
        char n='F';
        String name=new String("Faizan");
        byte rno=53;
        int sem1[]=new int[4];
        sem1[0]=81; sem1[1]=73; sem1[2]=54; sem1[3]=83;
        short sal=5000;
        int pin=509001;
        long no=9642979442L;
        float sal_d=166.67f;
        double sal_day=166.6666666666667;
        if(b==true)
        {
            System.out.println("Name Hint: "+n+" i.e., Name: "+name);
            System.out.println("Roll No: "+rno);
            System.out.println("M1: "+sem1[0]+", Chem: "+sem1[1]+", BEE: "+sem1[2]+", Eng: "+sem1[3]);
            System.out.println("Pin Code: "+pin);
            System.out.println("Mobile: "+no);
            System.out.println("Salary per Month: "+sal+"$");
            System.out.println("Salary per Day: "+sal_d+"$ (Approx)");
            System.out.println("Salary per Day: "+sal_day+"$ (Exact)");
        }
    }
}