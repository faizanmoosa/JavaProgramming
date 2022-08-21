//GCD or HCF of Two Numbers
package Java;
class HCF_a
{
    int a, ja;
    HCF_a(int x)
    {
        a=x;
    }
    int arr1[]=new int[a];
    void method(int i, int j)
    {
        arr1[j]=i;
        ja=j;
    }
    void terminate()
    {
        arr1[ja]='\0';
    }
    void display()
    {
        int i=0;
        System.out.print("Factors of "+a+" : ");
        while(arr1[i]!='\0')
        {
            System.out.print(arr1[i]+"\t");
            i++;
        }
        System.out.println();
    }
}
class HCF_b
{
    int b,jb;
    HCF_b(int x)
    {
        b=x;
    }
    int arr2[]=new int[b];
    void method(int i, int j)
    {
        arr2[j]=i;
        jb=j;
    }
    void terminate()
    {
        arr2[jb]='\0';
    }
    void display()
    {
        int i=0;
        System.out.print("Factors of "+b+" : ");
        while(arr2[i]!='\0')
        {
            System.out.print(arr2[i]+"\t");
            i++;
        }
        System.out.println();
    }
}
class GCD
{
    public static void main(String args[])
    {
        int a=36,b=60,i=2,j=0;
        HCF_a ha = new HCF_a(a);
        while(a>0)
        {
            if(a%i!=0)
                i++;
            ha.method(i,j);
            a=a/i;
            j++;
        }
        ha.terminate();
        ha.display();
        HCF_b hb = new HCF_b(b);
        i=2;j=0;
        while(b>0)
        {
            if(b%i!=0)
                i++;
            hb.method(i,j);
            b=b/i;
            j++;
        }
        hb.terminate();
        hb.display();
    }
}
