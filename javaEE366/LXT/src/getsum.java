import com.sun.org.apache.xpath.internal.SourceTree;

public class getsum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                sum += i;
            }

        }
        System.out.print(sum);
    }

}

