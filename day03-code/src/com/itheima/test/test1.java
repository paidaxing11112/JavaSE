package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个整数");
    int number = sc.nextInt();
    System.out.println("百位是:"+number/100%100);
    System.out.println("十位是:"+number/10%10);
    System.out.println("个位是:"+number%10);
    }
}
