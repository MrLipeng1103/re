package Day05;

public class D5t5 {
    public static void main(String[] args) {


        String[] huase = {"黑桃", "红桃", "梅花", "方片"};
        String[] dianshu = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int count = 0;
        String poker[] = new String[huase.length * dianshu.length];

        for (int i = 0; i < huase.length; i++) {
            for (int j = 0; j < dianshu.length; j++) {
                poker[count++] = huase[i] + dianshu[j];
                System.out.print(huase[i] + dianshu[j]+"\"");
            }
            System.out.println("");
        }

    }
}
