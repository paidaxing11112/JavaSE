package repeat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入元素个数
        int n = sc.nextInt();
        int sum = 1;
        //记录是否有重复数字
        boolean temp = true;
        //用于数组移动
        int p = 0;
        //创建数组
        int[] num = new int[n];
        for (int i = 0;i < n;i++) {
            num[i] = sc.nextInt();
        }
        //以升序排序数组
        Arrays.sort(num);
        while (p < n) {
            sum = 1;
            //判断相同元素个数
            while (p < n - 1 && num[p] == num[p + 1]) {
                sum++;
                p++;
             }
            //若有相同元素则打印
             if (sum >= 2) {
                  System.out.println(num[p] + " " + sum);
                  temp = false;
             }
             p++;
        }
        //若无相同元素则打印None
        if (temp) {
            System.out.println("None");
        }
    }
}
