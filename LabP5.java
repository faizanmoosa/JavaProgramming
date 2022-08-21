//Implements multi-thread application that has three threads.
//First thread generates random integer.
//If value is even, second thread computes square of number and prints.
//If value is odd, third thread computes cube of number and prints.
import java.util.*;
class Even implements Runnable {
    public int n;
    public Even(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Generated number is "+n+" and square of "+n+" is "+(n*n));
    }
}
class Odd implements Runnable {
    public int n;
    public Odd(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Generated number is "+n+" and cube of "+n+" is "+(n*n*n));
    }
}
class RandomNumber extends Thread {
    public void run() {
        Random r = new Random();
        try {
            for(int i=0; i<3; i++) {
                int n = r.nextInt(50);
                if(n%2==0) {
                    Thread t = new Thread(new Even(n));
                    t.start();
                }
                else if(n%2!=0) {
                    Thread t = new Thread(new Odd(n));
                    t.start();
                }
            }
        }
        catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
public class LabP5 extends Thread {
    public static void main(String args[]) {
        RandomNumber r = new RandomNumber();
        r.start();
    }
}