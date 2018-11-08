package Day05;

public class dy {
    public static void main(String[] args) {
        worker w1=new worker();
        w1.show();
        w1.setName("张三");
        w1.setAge(18);
        w1.setSalary(100000);
        w1.show();
    w1.getName();
    w1.getAge();
    w1.getSalary();
        System.out.println();
        worker w2=new worker("李四",24,1222);
        w2.show();
    }
}
