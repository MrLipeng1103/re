package Day07;


import java.util.ArrayList;
import java.util.Scanner;

public class D7t3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.录入信息 0.退出");
            int num = sc.nextInt();
            if (num == 1) {
                Student stu = new Student();
                System.out.println("请输入姓名:");
                String name = sc.next();
                stu.setName(name);
                System.out.println("请输入年龄:");
                int age = sc.nextInt();
                stu.setAge(age);
                list.add(stu);
            } else if (num == 0) {
                break;
            }
        }
        System.out.println("录入完毕");
        for(int i=0;i<list.size();i++){
            Student student = new Student();
            student=list.get(i);
            System.out.print("学生姓名="+student.getName()+",年龄=");
            System.out.println(student.getAge());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
