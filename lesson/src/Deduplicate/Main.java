package Deduplicate;

import java.util.Scanner;

/**
 * @author gan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        boolean temp = false;
        //填充数组
        for (int i = 0;i < n;i++) {
            num[i] = sc.nextInt();
        }
        //若只有一个数则直接输出
        if (n == 1) {
            System.out.println(num[0]);
        } else {
            //第一个数不动,移动第二个数,删除重复元素
            for (int i = 0;i < n;i++) {
                //若删除成功,i不动,再次寻找num[i]的重复元素
                if (temp) {
                    i--;
                }
                temp = false;
                // 此段代码用于移除数组中的重复元素，并调整数组长度
                for (int j = i + 1;j < n;j++) {
                    if (num[i] == num[j]) {
                        for (int p = j;p < n - 1 && j < n - 1;p++) {
                            if (p + 1 < n) {
                                num[p] = num[p + 1];
                            }
                        }
                        temp = true;
                        n--;
                    }
                }

            }
            for (int i = 0;i < n;i++) {
                System.out.print(num[i] + " ");
            }


        }
    }
}
