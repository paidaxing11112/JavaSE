package com.itheima.text;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示小明的成绩");
        int score = sc.nextInt();
        if(score >= 0 && score <=100) {
            if(score >= 95 && score <= 100 ) {
                System.out.println("送自行车一辆");
            } else if(score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if(score >= 80 && score <= 89) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("挨打一顿");
            }
        } else {
            System.out.println("当前录入的成绩不正确");
        }
    }
}
