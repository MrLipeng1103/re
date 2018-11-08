package Day04;

import java.util.Scanner;

public class D4t3 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a >= 48 && a <= 57 || a >= 65 && a <= 90 || a >= 97 && a <= 122) {
                System.out.println("字符:" + getChar(a));
                System.out.println("字符串:" + getString(a));
            } else {
                System.out.println("字符:" + " ");
                System.out.println("字符串:" + " ");

            }
        }
    }
    public static char getChar(int num) {
        char s = (char) (num);
        return s;

    }

    public static String getString(int num) {
        char a = (char) (num);
        String s = "";
        for (int i = 0; i < 4; i++) {
            s = s + a;
        }
        return s;
    }

}
