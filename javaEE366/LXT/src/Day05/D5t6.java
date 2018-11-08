package Day05;

public class D5t6 {
    public static void main(String[] args) {
        String[] a = {"D", "C", "B", "A", "D"};
        int c=daan(a);
        System.out.println("满分10分,小传:得分:"+c+"分");
        String[] b = {"A", "D", "B", "C", "D"};
        int z=daan(b);
        System.out.println("满分10分,小智:得分:"+z+"分");
        String[] d = {"A", "D", "B", "C", "A"};
        int e=daan(d);
        System.out.println("满分10分,小播:得分:"+e+"分");
        String[] g = {"A", "B", "C", "D", "D"};
        int h=daan(d);
        System.out.println("满分10分,小课:得分:"+h+"分");

    }

    public static int daan(String[] a) {
        String[] da = {"A","D","B","C","D"};
        int score = 0;
        for (int i = 0; i < da.length; i++) {
            if (da[i] == a[i]) {
                score += 2;
            }
        }
        return score;
    }

}
