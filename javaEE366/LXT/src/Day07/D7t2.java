package Day07;

import java.util.ArrayList;
import java.util.Random;

public class D7t2 {
    public static void main(String[] args) {
        //ArrayList<Character> list = new ArrayList<>();
        char[] list=new char[62];
        int count=0;
        for (int i = 48; i<123; i++) {
            if(i >= 48 && i < 58 || i >= 65 && i < 91 || i >= 97 && i < 123) {
                char s = (char) i;
                //list.add(s);
                list[count++]=s;

            }
        }
        Random sj = new Random();
        System.out.print("随机验证码:");
        for (int j = 0; j < 6; j++) {
            int num = sj.nextInt(62) ;
            //System.out.print("随机验证码:"+list.get(num));
            System.out.print(list[num]);
        }


    }

}