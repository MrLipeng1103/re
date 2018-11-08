package com.heima03;

public class Dysjx {
    public static void main(String[] args){
        san();
    }
    public static void san(){
        //int N =8;
        for(int i=1;i<4;i++){
            for(int j = 0;j <=4-i;j++) {
                System.out.print(" ");
            }
            for(int b=0;b<(2*i-1);b++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for(int j=1;j<3;j++){
        //    for(int b=0;b<j-1;b++){
        //        System.out.print("*");
        //    }
        //    for(int k = 0;k <=6-j;k++) {
        //        System.out.print(" ");
        //    }
        //    System.out.println();
//
        //}
    }

}
