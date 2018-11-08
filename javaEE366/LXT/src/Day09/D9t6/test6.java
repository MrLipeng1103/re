package Day09.D9t6;

public class test6 {
    public static void main(String[] args) {
       Manager m1 = new Manager("M001","张小强","销售部");
       Clerk c1=new Clerk("C001","李小亮","销售部");
        m1.setClerk(c1);
        c1.setManager(m1);
        c1.show();
        m1.show();
    }
}
