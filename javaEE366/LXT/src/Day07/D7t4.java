package Day07;

import java.util.ArrayList;
import java.util.Random;

public class D7t4 {

    public static void main(String[] args) {
        ArrayList<Integer> fenshulist = getScoreList();
        ArrayList<Integer> countlist = countScore(fenshulist);
        printCount(countlist);
    }

    public static ArrayList<Integer> getScoreList() {
        ArrayList<Integer> sjsl = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            int num = r.nextInt(100);
            sjsl.add(num);
        }
        return sjsl;
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> defenlist) {
        int count = 0, count2 = 0, count3 = 0, count4 = 0, j = 0;
        for (int i = 0; i < defenlist.size(); i++) {
            j = defenlist.get(i);
            if (j > 79 && j <= 100) {
                count++;
            } else if (j > 59 && j <= 79) {
                count2++;
            } else if (j > 39 && j <= 59) {
                count3++;
            } else if (j >= 0 && j <= 39) {
                count4++;
            }
        }
        ArrayList<Integer> countlist = new ArrayList<>();
        countlist.add(count);
        countlist.add(count2);
        countlist.add(count3);
        countlist.add(count4);

        return countlist;
    }

    public static void printCount(ArrayList<Integer> list) {
        System.out.println("100分--80分:" + list.get(0));
        System.out.println("79分--60分:" + list.get(1));
        System.out.println("59分--40分:" + list.get(2));
        System.out.println("39分--0分:" + list.get(3));
    }

}
