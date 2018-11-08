package Day08;

import java.util.Scanner;

public class D8t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("请输入运算符:");
        String ch = sc.next();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();
        switch (ch) {
            case "+":
                System.out.println(num1 + ch + num2 + "=" + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + ch + num2 + "=" + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + ch + num2 + "=" + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + ch + num2 + "=" + (num1 / num2));
                break;
            case "%":
                System.out.println(num1 + ch + num2 + "=" + (num1 % num2));
                break;

        }

    }
}

