package Day04;

public class D4t5 {
    public static void main(String[] args) {
        getValue("大",556,56,1555);
    }

    public static void getValue(String ext, int a, int b, int c) {
        switch (ext) {
            case "大":
                int d = a > b ? a : b;
                int max = d > c ? d : c;
                System.out.println("最大值为:"+max);
                break;
            case "小":
                int f = a < b ? a : b;
                int min = f < c ? f : c;
                System.out.println("最小值为:"+min);
                break;
        }
    }
}
