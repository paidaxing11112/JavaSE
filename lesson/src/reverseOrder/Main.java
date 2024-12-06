package reverseOrder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = 0;
        //记录逆序数
        int reverseOrder = 0;
        //记录反序数
        int antithesis = 0;
        int[] p = new int[100];
        //将个位数输入数组中并计算反序数
        while (num != 0) {
            p[temp] = num % 10;
            antithesis = antithesis * 10 + num % 10;
            num /= 10;
            temp++;
        }
        //计算平方和并输出各位数
        for (int i = temp - 1;i >= 0;i--) {
            System.out.print(p[i] + " ");
            sum += Math.pow(p[i],2);
        }
        System.out.println("\n" + sum);
        System.out.println(antithesis);
        //计算逆序数
        for (int i = temp - 1;i >= 0;i--) {
            for (int j = i - 1;j >= 0;j--) {
                if(p[i] > p[j]) {
                    reverseOrder++;
                }
            }
        }
        System.out.println(reverseOrder);
    }
}
