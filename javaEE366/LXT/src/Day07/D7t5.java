package Day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class D7t5 {
    public static void main(String[] args) {
        ArrayList<Integer> Index = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Index = getArrayList();
        System.out.println(Index);
        System.out.println("请输入一个数字:");
        int a = sc.nextInt();

        int num = findIndex(Index, a);
        if (num != -1) {
            System.out.println(a + "的索引是" + num);
        } else {
            System.out.println("无结果");
        }
        System.out.println("需要修改的数:");
        int change = sc.nextInt();
        System.out.println("需要全部修改成一个什么数:");
        int target = sc.nextInt();
        replace(Index, change, target);
    }

    public static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> index = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            index.add(num);
        }
        return index;
    }

    public static int findIndex(ArrayList<Integer> index, int a) {
        for (int i = 0; i < index.size(); i++) {
            if (index.get(i) == a) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void replace(ArrayList<Integer> Index, int change, int target) {
        System.out.println("修改前:" + Index);
        for (int i = 0; i < Index.size(); i++) {
            if (Index.get(i) == change) {
                Index.set(i, target);
            } else {
                continue;
            }
        }
        System.out.println("修改后:" + Index);
    }
}
