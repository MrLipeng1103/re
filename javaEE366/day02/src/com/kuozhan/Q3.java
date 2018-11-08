package com.kuozhan;
/* 打印四位位数字中(个位+百位)等于(十位+千位)的所有数字
    要求:
        1.满足条件的数字要5个一行打印,每个数字之间用空格隔开
        3.打印完毕所有满足条件的数字后,最后一行打印"满足条件的数字总共有XXX个"
        4.打印格式如下:
            1001 1012 1023 1034 1045
            1056 1067 1078 1089 1100
            1111 1122 1133 1144 1155
            1166 1177 1188 1199 1210
            1221 1232 1243 1254 1265
            1276 1287 1298 1320 1331
            ...
            满足条件的数字总共有 615 个
*/

public class Q3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 10000; i++) {
            int a = i / 1000;
            int b = (i % 1000) / 100;
            int c = (i % 100) / 10;
            int d = i % 10;
            if ((a + c) == (b + d)) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("满足条件的数字总共有" + count + "个");
    }
}

