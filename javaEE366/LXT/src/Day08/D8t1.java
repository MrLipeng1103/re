package Day08;

import java.util.Scanner;

public class D8t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println("录入的字符串:"+s);
        System.out.println("------------------");
        char[] chs=s.toCharArray();
        System.out.print("反转的字符串:");
        for (int i = chs.length-1; i >= 0; i--) {
            String s1=chs[i]+"";
            System.out.print(s1);
        }

    }
}
