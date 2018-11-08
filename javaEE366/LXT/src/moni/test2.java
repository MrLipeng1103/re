package moni;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> oslist = new ArrayList<>();
        ArrayList<Integer> jslist = new ArrayList<>();
        while (true) {
            System.out.println("请输入第" + count + "个数字:");
            int num = sc.nextInt();
            if (num < 300 || num > 400) {
                System.out.println("输入错误范围请重新输入");
            } else {
                list.add(num);
                count++;
            }
            if (count == 9) {
                break;
            }
        }
        tes(list, oslist, jslist);
        System.out.println(jslist);
        System.out.println(oslist);
    }

    public static void tes(ArrayList<Integer> list, ArrayList<Integer> oslist, ArrayList<Integer> jslist) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                oslist.add(list.get(i));
            } else {
                jslist.add(list.get(i));
            }
        }
    }
}




