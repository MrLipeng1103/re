package Day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class D7t6 {
    public static void main(String[] args) {
        ArrayList<Integer> zlist = new ArrayList<>();
        ArrayList<Integer> clist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(50) + 1;
            if (!zlist.contains(num))
            zlist.add(num);
        }
        //ArrayList<Integer> clist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个整数:");
        int count = 0;
        while (count < 10) {
            int num2 = sc.nextInt();
            if (!clist.contains(num2)) {
                clist.add(num2);
                count++;
            } else {
                continue;
            }
        }
        int num1 = compare(zlist, clist);
        System.out.println("您输入的号码是:"+clist);
        System.out.println("乐透号码是:"+zlist);
        System.out.println("猜中了" + num1 + "个");
    }

    public static int compare(ArrayList<Integer> list, ArrayList<Integer> list1) {
        int count = 0, num = 0;
        for(int i=0;i<list1.size();i++)
        if (list.contains(list1.get(i))) {
            num = count++;
        }
        return num;
    }
}
