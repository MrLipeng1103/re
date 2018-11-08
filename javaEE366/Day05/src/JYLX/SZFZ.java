package JYLX;

public class SZFZ {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + "\t");
        }
    }
}
