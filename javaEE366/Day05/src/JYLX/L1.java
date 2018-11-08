package JYLX;

public class L1 {
    /* public static void main(String[] args) {
         int[] s1 = new int[5];
         int[] s2 = new int[]{0, 1, 2, 3, 4, 5, 6};
         int[] s3 = {1, 2, 3, 4, 5};
         System.out.println(s1.length);
         s1[0] = 2;
         int i = s1[0];
         System.out.println(i);
         System.out.println(s1);*/
    public static void main(String[] args) {
        int[] s1 = {100, 15, 2000, 4000, 20000};
        int max = s1[0];
        for (int i = 0; i < s1.length; i++) {
            if (max < s1[i]) {
                max = s1[i];
            }
        }
        System.out.println("最大值是:" + max);
    }
}


