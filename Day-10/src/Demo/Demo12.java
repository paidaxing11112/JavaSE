package Demo;

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String talk = "12312452tmd";
        String s = talk.replace("tmd", "***");
        System.out.println(s);
    }
}
