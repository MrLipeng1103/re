package Day05;

import java.util.Scanner;

public class D5t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3 ,4,5};
        boolean c = C(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+",");
        }
        System.out.println();
        System.out.println("是否一致:" + c);

    }

    public static boolean C(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

        }
        return true;
    }


}



