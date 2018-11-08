package Day04;

import java.util.Scanner;

public class D4t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入摄氏度:");
            double a = sc.nextInt();
            double b = convert1(a);
            System.out.print("摄氏度为:" + a + "°" + "--" + "华氏度为:" + b);
            System.out.println();
            break;
        }
        while (true) {
            System.out.println("输入华氏度:");
            double c = sc.nextInt();
            double d = convert2(c);
            System.out.println("华氏度为:" + c + "°" + "--" + "摄氏度为:" + d);
            break;
        }

    }


    public static double convert1(double a) {
        double b = (9.0 / 5) * a + 32;
        return b;
    }

    public static double convert2(double a) {
        double c = (a - 32)/(9.0/5);
        return c;
    }
}

