package com.heima03;

import java.util.Scanner;

public class D3t1 {
    public static void main(String[] args) {
        double discount = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        double totalPrice = sc.nextDouble();
        if (totalPrice >= 500) {
            discount = 0.5;
        } else if (totalPrice >= 400 && totalPrice < 500) {
            discount = 0.6;
        } else if (totalPrice >= 300 && totalPrice < 400) {
            discount = 0.7;
        } else if (totalPrice >= 200 && totalPrice < 300) {
            discount = 0.8;
        }
        System.out.println((int)totalPrice);
        System.out.println(totalPrice*discount);

    }

}

