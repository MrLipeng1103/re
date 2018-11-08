package com.heima02;

public class D8 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        String str = null;
        int num = 69;
        str = (num % 2 == 0 ? "偶数" : "奇数");
        System.out.println("num:" + num + "是" + str);

    }
}
