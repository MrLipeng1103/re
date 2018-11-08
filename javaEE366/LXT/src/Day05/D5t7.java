package Day05;


import java.util.Arrays;

public class D5t7 {
    public static void main(String[] args) {
        char[] zifu = {'a', 'f', 'j', 'l'};
        printCount(zifu);
    }


    public static void printCount(char[] zifu) {
        int[] count = new int[26];
        for (int i = 0; i < zifu.length; i++) {
            int c = zifu[i];
            count[c - 97]++;
        }
        for (int i = 0, ch = 97; i < count.length; i++, ch++)
            if (count[i] != 0) {
                System.out.println((char)ch + "--" + count[i]);
            }
    }
}

