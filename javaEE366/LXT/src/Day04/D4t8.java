package Day04;

import java.util.Scanner;

public class D4t8 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字:");
            int i = sc.nextInt();
            for (int a = 0; a <= i; a++) {
                if (a % 2 == 0) {
                    System.out.println(a);
                }
            }

        }
    }
}
