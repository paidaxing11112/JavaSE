package com.itheima.text;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int price = 1000;
        Scanner ab = new Scanner(System.in);
        System.out.println("请输入会员级别");
        int VIP = ab.nextInt();
        if(VIP == 1) {
            System.out.println("实际支付的钱"+price * 0.9);
        } else if(VIP == 2) {
            System.out.println("实际支付的钱"+price * 0.8);
        } else if(VIP == 3) {
            System.out.println("实际支付的钱"+price * 0.7);
        } else {
            System.out.println("实际支付的钱"+price);
        }
    }
}
