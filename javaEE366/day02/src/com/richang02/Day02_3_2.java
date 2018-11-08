package com.richang02;

import java.util.Scanner;

public class Day02_3_2 {
    /* public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
         System.out.print("请输入年龄:");
         int c=sc.nextInt();
         System.out.println("年龄:"+c);
         System.out.print("请输入身高:");
         int a =sc.nextInt();
         System.out.println("身高:"+a+"cm");
         System.out.print("请输入姓名:");
         String b =sc.next();
         System.out.print("姓名:"+b);
     }
 }
 public class Test03 {*/
   // public static void main(String[] args) {
//        int x = 4;
////        int y = (--x);
////        y=y+(x--);
////        y=y+(x*10);
////        System.out.println("x = " + x + ",y = " + y);
////    }
        public static void main(String[] args) {
            short s = 30;
            int i = 50;
            s += i;
            System.out.println("s="+s);
            int x = 0;
            int y = 0;
            int z = 0;
            boolean a,b;
            a = x>0 & y++>1;
            System.out.println("a="+a);
            System.out.println("y="+y);
            b = x>0 && z++>1;
            System.out.println("b="+b);
            System.out.println("z="+z);
            a = x>0 | y++>1;
            System.out.println("a="+a);
            System.out.println("y="+y);
            b = x>0 || z++>1;
            System.out.println("b="+b);
            System.out.println("z="+z);
        }
    }

