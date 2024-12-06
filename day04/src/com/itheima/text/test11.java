package com.itheima.text;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期");
        int week = sc.nextInt();
        switch (week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入错误");
        }
    }
}
