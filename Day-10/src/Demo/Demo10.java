package Demo;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str =sc.next();
        String start = str.substring(0,3);
        String end = str.substring(7);
        System.out.println(start + "****" + end);
    }
}
