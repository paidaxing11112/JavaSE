package valley;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //记录峰谷个数
        int p = 0;
        int[] num = new int[n];
        //输入n个数
        for (int i = 0;i < n;i++) {
            num[i] = sc.nextInt();
        }
        //若只有一个数则输出一
        if (n == 1) {
            System.out.println("1");
        } else {
            //判断第一个数是否为峰谷
            if (num[0] < num[1]) {
                p++;
            }
            //判断最后一个数是否为峰谷
            if (num[n - 1] < num[n - 2]) {
                p++;
            }
            //判断第二个数到倒数第二个数是否为峰谷
            for (int i = 1;i < n - 1;i++) {
                if (num[i] < num [i -1] && num[i] < num[i + 1]) {
                    p++;
                }
            }
        }
        System.out.println(p);
    }
}
