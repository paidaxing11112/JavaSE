package com.itheima.text;

public class test15 {
    public static void main(String[] args) {
        int sum = 0;
        /*for (int i = 1;i <= 100; i++) {
            sum += i % 2 == 0 ? i : 0;//三元运算符若偶数则求和
        }*/
        for (int i = 2;i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
