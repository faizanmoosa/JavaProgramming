public class QuickSortForStrings {
    String names[];
    int length;
    public static void main(String s[]) {
        QuickSortForStrings obj = new QuickSortForStrings();
        String stringList[] = {"Mohd", "Faizan", "Moosa"};
        obj.sort(stringList);
        for(int i=0;i<stringList.length;i++) {
            System.out.print(stringList[i]+"\t");
        }
    }
    void sort(String arr[]) {
        names=arr;
        length=arr.length;
        quickSort(0,length-1);
    }
    void quickSort(int li, int lj) {
        int i=li, j=lj;
        String pivot=names[i + (j-1)/2];
        while(i<=j) {
            while(names[i].compareToIgnoreCase(pivot)<0) {
                i++;
            }
            while(names[j].compareToIgnoreCase(pivot)>0) {
                j--;
            }
            exchange(i,j);
            i++;
            j--;
        }
        if(li<j)
            quickSort(li,j);
        if(i<lj)
            quickSort(i,lj);
    }
    void exchange(int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
}
