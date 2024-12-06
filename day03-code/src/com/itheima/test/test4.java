package com.itheima.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //判断两只老虎的重量是否相等
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的重量:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二只老虎的重量:");
        int number2 = sc.nextInt();
        String result = number1 == number2 ? "相等" : "不相等";
        System.out.println(result);
    }
}