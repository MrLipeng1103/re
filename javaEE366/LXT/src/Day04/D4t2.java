package Day04;

public class D4t2 {
    public static void main(String[] args) {
        boolean i = doCheck(2);
        System.out.println(i);
        boolean f = doCheck(3);
        System.out.println(f);
    }

    public static boolean doCheck(int num) {
        boolean flag = true;
        if (num % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                num -= i;
                flag = true;
            }
        } else {
            for (int i = 0; i <= 20; i++) {
                num += i;
                flag = false;
            }
        }
        System.out.println("num:"+num);
        return flag;
    }
}

