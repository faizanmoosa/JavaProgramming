import java.io.*;
public class FilesDemo {
    public static void main(String s[]) {
        File f1, f2, f3;
        FileInputStream fobj1, fobj2;
        FileOutputStream obj;
        try {
            f1 = new File("/Users/faizanmoosa/Documents/Code/Java/newFile1.txt");
            f2 = new File("/Users/faizanmoosa/Documents/Code/Java/newFile2.txt");
            f3 = new File("/Users/faizanmoosa/Documents/Code/Java/newFile3.txt");
            fobj1 = new FileInputStream(f1);
            fobj2 = new FileInputStream(f2);
            obj = new FileOutputStream(f3,true);
            byte[] buf = new byte[1024];
            int len;
            while((len=fobj1.read(buf))>0) {
                obj.write(buf,0,len);
            }
            while((len=fobj2.read(buf))>0) {
                obj.write(buf,0,len);
            }
            fobj1.close();
            fobj2.close();
            obj.close();
            System.out.println("File Copied");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}