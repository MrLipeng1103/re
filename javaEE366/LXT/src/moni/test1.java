package moni;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String str = sc.next();
        char[] chs = str.toCharArray();
        int count = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] >= '0' && chs[i] <= '9') {
                count++;}
                else if ((chs[i] >= 'a' && chs[i] <= 'z' )|| (chs[i] >= 'A' && chs[i] <= 'Z')) {
                    count1++;
                }else{
                    count2++;
                }
            }
        System.out.println("英文字母个数:" + count1);
        System.out.println("数字个数:" + count);
        System.out.println("其他字符个数:" + count2);
    }
    }

