import java.io.*;
public class listFilesPrgm {
    public static void main(String[] s) {
        File f = new File("/Users/faizanmoosa/Documents/Code/Java");
        File list[] = f.listFiles();
        System.out.print("List of Files: ");
        for(int i=0;i<list.length;i++) {
            System.out.println(list[i].getName());
            if(list[i].isDirectory()) {
                System.out.println("Sub-Directory: "+list[i]);
            }
        }
    }
}