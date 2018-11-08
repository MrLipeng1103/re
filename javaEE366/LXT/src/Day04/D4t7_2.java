package Day04;

import java.util.Scanner;

public class D4t7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入转换方式:");
            String i = sc.nextLine();
            switch (i) {
                case ("s-h"): {
                    System.out.println("输入摄氏度:");
                    double a = sc.nextInt();
                    double b = convert1(a);
                    System.out.print("摄氏度为:" + a + "°" + "--" + "华氏度为:" + b);
                    System.out.println();
                    break;
                }
                case ("h-s"): {
                    System.out.println("输入华氏度:");
                    double a = sc.nextInt();
                    double b = convert2(a);
                    System.out.println("华氏度为:" + a + "°" + "--" + "摄氏度为:" + b);
                    break;
                }

            }
        }
    }


    public static double convert1(double a) {
        double b = (9.0 / 5) * a + 32;
        return b;
    }

    public static double convert2(double a) {
        double b = (a - 32) / (9.0 / 5);
        return b;
    }
}

