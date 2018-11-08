package com.richang03;

import java.util.Scanner;

public class T1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩:");
        while (true) {
            int a = sc.nextInt();
            if (a >= 90 && a <= 100) {
                System.out.println("优秀");
            } else if (a >= 80 && a <= 90) {
                System.out.println("好");
            } else if (a >= 70 && a <= 80) {
                System.out.println("良");
            } else if (a >= 60 && a <= 70) {
                System.out.println("及格");
            } else if (a < 60) {
                System.out.println("不及格");
            } else {
                System.out.println("输入数据错误");
            }
        }
    }
}