package com.heima03;

public class D3t5 {
    public static void main(String[] args) {
        String str = "J";
        for (int i = 0; i < 5; i++) {
            int key = i % 3;
            switch (key) {
                case 0:
                    str = str + 'a';
                    i++;
                    break;
                case 2:
                    str =str + 'V';

            }
        }
        System.out.println(str);
    }
}
