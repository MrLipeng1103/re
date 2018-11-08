package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class D8t7 {
    public static void main(String[] args) {
        ArrayList<Users> list = new ArrayList<Users>();
        Users u1 = new Users("zhangsan", "888888");
        Users u2 = new Users("zhangsi", "777777");
        Users u3 = new Users("zhangwu", "666666");
        Users u4 = new Users("zhangliu", "555555");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String code = sc.next();
        int num=check(list, username, code);
     switch(num){
         case 1:
             System.out.println("登陆成功");
             break;
         case 2:
             System.out.println("密码错误");
             break;
         case 3:
             System.out.println("登录名无效");
             break;
     }
    }

    public static int check(ArrayList<Users> list, String username, String code) {
        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i).getName())) {
                if (code.equals((list.get(i).getCode()))) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 3;
    }
}



