package com.itheima.test;

public class test6 {
    public static void main(String[] args) {
        double father = 177,mother = 165;
        double son = (father + mother) * 1.08 / 2,daughter = ((father * 0.923) + mother) / 2;
        System.out.println(son);
        System.out.println(daughter);
    }
}
