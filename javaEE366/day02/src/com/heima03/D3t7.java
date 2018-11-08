package com.heima03;

public class D3t7 {
    public static void main(String[] args) {
        int count = 0;
        double h = 0.0001;
        while (true) {
            h = h * 2;
            count++;
            if (h > 8848) {
                System.out.println(count);
                break;
            }
        }
    }
}
