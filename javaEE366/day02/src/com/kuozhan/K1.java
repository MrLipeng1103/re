package com.kuozhan;/* 一.题目:
	打印大于1小于1000的所有素数
    要求:
        1.所谓的素数指的是只能被1和本身整除的数字
        2.满足条件的素数要5个一行打印,每个数字之间用空格隔开
        3.打印完毕所有的素数后,最后一行打印"满足条件的素数总共有XXX个"
        4.打印格式如下:
            2 3 5 7 11
            13 17 19 23 29
            31 37 41 43 47
            53 59 61 67 71
            73 79 83 89 97
            ....
            满足条件的素数总共有 168 个*/


public class K1 {
    public static void main(String[] args) {
        printNum();


    }

    public static void printNum() {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            int s = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s++;
                }
            }
            if (s == 2) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("1000以内所有素数总共为" + count + "个");
    }
}

