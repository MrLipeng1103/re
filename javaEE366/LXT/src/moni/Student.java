package moni;

public class Student {
    String name;
    int score;
    teacher Teacher;

    public Student() {
    }

    public Student(String name, int score, teacher teacher) {
        this.name = name;
        this.score = score;
        Teacher = teacher;
    }

    public void getMyResult() {
        System.out.println("我是学生" + name + ",我的老师是" + Teacher.name + ",他教我" + Teacher.course + "学科");
        if (score > 60) {
            System.out.println("继续加油哦");
        }else {
            System.out.println("成绩太低了,老师"+Teacher.name+"让我回去罚写100遍");
        }
    }
}
