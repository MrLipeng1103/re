package Day07;

import java.util.Scanner;

public class D7t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数：");
        int c=sc.nextInt();
        int max=(a>b?a>c?a:c:b>c?b:c);
        System.out.println("max:"+max);
    }
}
