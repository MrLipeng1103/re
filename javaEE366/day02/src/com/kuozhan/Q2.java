package com.kuozhan;

/*
打印三位数字中所有的水仙花数字
        要求:
        1.所谓的水仙花数字指的每位数字的立方和等于该数字本身
        比如:153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
        2.满足条件的水仙花数字要2个一行打印,每个数字之间用空格隔开
        3.打印完毕所有的水仙花数字后,最后一行打印"满足条件的水仙花数字总共有XXX个"
        4.打印格式如下:
        153 370
        371 407
        满足条件的水仙花数字总共有 4 个*/
public class Q2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int a = (i / 100);
            int b = (i % 100) / 10;
            int c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.print(i + "\t");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
