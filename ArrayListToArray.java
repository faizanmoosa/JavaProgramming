import java.util.*;
public class ArrayListToArray {
    public static void main(String s[]) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(5);
        a1.add(10);
        a1.add(15);
        a1.add(20);
        a1.add(25);
        Integer arr[] = new Integer[a1.size()];
        arr = a1.toArray(arr);
        for(Integer x : arr) {
            System.out.print(x+" ");
        }
    }
}
