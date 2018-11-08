package JYLX;

public class SZZXZ {
    public static void main(String[] args) {
        int[] a = {100, 20, 600, 300, 8555};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("数组的最小值:" + min);
    }
}
