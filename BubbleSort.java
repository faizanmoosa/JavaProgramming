import java.util.*;
public class BubbleSort {
    public static void main(String[] s) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+ " elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        System.out.print("List of Sorted Elements: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nInterchanges: "+count);
    }
}
