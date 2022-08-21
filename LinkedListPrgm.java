import java.util.*;
public class LinkedListPrgm {
    public static void main(String args[]) {
        LinkedList<Integer> l = new LinkedList<Integer> ();
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
    }
}
