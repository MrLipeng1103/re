package Day04;

public class D4t6 {
    public static void main(String[] args) {
        round(2.4);
    }
    public static double round(double a) {
        a += 0.5;
        int b = (int) a;
        System.out.println(b);
        return b;
    }
}
