package Day08;

import java.util.ArrayList;

public class D8t5 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("abcd");
        str.add("abcdef");
        str.add("abcdefgh");
        str.add("abc");
        str.add("你好啊");
        str.add("我不好啊");
        System.out.println("原字符串:"+"\n"+str);
        for(int i=str.size()-1;i>=0;i--) {
        if(str.get(i).length()>5){
            str.remove(i);
        }
        }
        System.out.println("删除后:");
        System.out.println(str);
    }
}
