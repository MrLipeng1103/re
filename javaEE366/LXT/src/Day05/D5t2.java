package Day05;

public class D5t2 {
    public static void main(String[] args) {
        int[] a = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int s = getAvg(a);
        int count=0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]>s){
                count++;
            }
        }
        System.out.println("高于平均分:"+s+"的个数有"+count+"个");
    }

    public static int getAvg(int[] a) {
        int avg = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        avg = sum / a.length;
        return avg;
    }
}
