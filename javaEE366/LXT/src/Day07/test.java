package Day07;

import java.text.DecimalFormat;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String[] ss=new String[7];
        //ArrayList<Integer> hQ = new ArrayList<Integer>();
       //ArrayList<Integer> lQ = new ArrayList<Integer>();
        DecimalFormat df = new DecimalFormat("00");

        //System.out.println(df.format(s));
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            int num = r.nextInt(32) + 1;
            String s = df.format(num);
            ss[i]=s;
        }
        System.out.print("红球:");
        for (int j = 0; j <6; j++) {
            System.out.print(ss[j]+" ");
        }
        System.out.println("\n"+"蓝球:"+ss[6]);
    }
}
