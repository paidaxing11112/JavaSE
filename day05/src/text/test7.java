package text;

import java.util.Random;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你猜的数字:");
            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("恭喜你猜对了！");
                break;
            } else if (guess < num) {
                System.out.println("猜的数字小了，再试试吧！");
            } else {
                System.out.println("猜的数字大了，再试试吧！");
            }
        }
    }
}
