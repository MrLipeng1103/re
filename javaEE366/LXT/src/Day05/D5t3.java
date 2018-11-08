package Day05;

import java.util.Scanner;

public class D5t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int j=0;j<a.length;j++) {
            a[j] = sc.nextInt();
        }
            //int[] a = {1, 2, 3, 2, 1};
            boolean s = com(a);
            System.out.print("[");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + ",");
            }
            System.out.println("]是否对称:" + s);

    }

    public static boolean com(int[] a) {
        for (int s = 0, e = a.length - 1; s < e; s++, e--) {
            if (a[s] != a[e]) {
                return false;
            }
        }
        return true;
    }
}

