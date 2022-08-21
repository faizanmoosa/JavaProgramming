import java.util.*;
class Even implements Runnable {
    public int X;
    public Even(int X) {
        this.X = X;
    }
    public void run() {
        System.out.println(X+" is even and square of "+X+" is: "+(X*X));
    }
}
class Odd implements Runnable {
    public int X;
    public Odd(int X) {
        this.X = X;
    }
    public void run() {
        System.out.println(X+" is odd and cube of "+X+" is: "+(X*X*X));
    }
}
class A extends Thread{
    public void run() {
        int n;
        Random r = new Random();
        try {
            for(int i=0;i<5;i++) {
                n = r.nextInt();
                System.out.println("Random number generated i.e., "+n);
                if(n%2==0) {
                    Thread t1 = new Thread(new Even(n));
                    t1.start();
                }
                else if(n%2!=0) {
                    Thread t1 = new Thread(new Odd(n));
                    t1.start();
                }
            }
        }
        catch(Exception e) {}
    }
}
public class ThreadPrgrm {
    public static void main(String s[]) {
        A a = new A();
        a.start();
    }
}
