package Deom;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "D:\\Users\\alienware\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);
        String parent = "D:\\Users\\alienware\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);
    }
}
