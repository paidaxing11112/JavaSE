package com.itheima.text;

import java.util.Scanner;

public class text19 {
    public static void main(String[] args) {
        //不用乘法除法计算商和余数
        Scanner sc = new Scanner(System.in);
        int chushu = sc.nextInt();
        int beichushu = sc.nextInt();
        int num = 0;
        while (chushu >= beichushu) {
            chushu = chushu - beichushu;
            num++;
        }
        System.out.println("商为:" + num);
        System.out.println("余数为:" + chushu);
    }
}
