package Day08;

import java.util.Scanner;

public class D8t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串:");
        String str = sc.next();
        Scanner scc = new Scanner(System.in);
        System.out.println("请输入小字符串:");
        String str2 = scc.next();
        int b=js(str,str2);
        System.out.println("小字符串"+str2+",在大字符串中出现:"+b+"次");
    }

    public static int js(String str, String str2) {
        String replace = str.replace(str2, "");
        return (str.length()-replace.length())/str2.length();
    }

}
