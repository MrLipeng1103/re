package Day04;

import java.util.Scanner;

public class D4t6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        round(i);
    }

    public static double round(double a) {
        a += 0.5;
        int b = (int) a;
        System.out.println(b);
        return b;
    }
}
