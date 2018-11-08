package Day08;

import java.util.Scanner;

public class D8t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号:");
        String str = sc.next();
        //boolean c=pd(str);
        System.out.println("这个QQ号是否正确:"+pd(str));
    }
    public static boolean pd(String str) {
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] > '9' || chs[i] < '0') {
                return false;
            }
        }
        //System.out.println(chs);
        if (chs.length < 5 || chs.length> 12) {
            return false;
        }else if(chs[0] == '0') {//错将字符'0'写为数字0
            return false;
        }
        return true;

    }
}
