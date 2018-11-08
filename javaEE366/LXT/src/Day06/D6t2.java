package Day06;

public class D6t2 {
    public static void main(String[] args) {
        Teacher zhou = new Teacher("周老师", 30, "JAV面向对象的知识....");

        System.out.print("年龄为" + zhou.getAge() + "的" + zhou.getName() + "正在");
        zhou.eat();
        System.out.print("年龄为" + zhou.getAge() + "的" + zhou.getName() + "正在");
        zhou.teach();
        System.out.print(zhou.getContent());
        System.out.println();
        Student han = new Student();
        han.setName("韩同学");
        han.setAge(18);
        han.setContent("JAV面向对象的知识....");
        System.out.print("年龄为" + han.getAge() + "的" + han.getName() + "正在");
        han.eat();
        System.out.print("年龄为" + han.getAge() + "的" + han.getName() + "正在");
        han.study();
        System.out.println(han.getContent());
    }
}

class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public void eat() {
        System.out.println("吃饭...");
    }

    public void teach() {
        System.out.print("讲着");
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


class Student {
    private String name;
    private int age;
    private String content;

    public void eat() {
        System.out.println("吃饭...");
    }

    public void study() {
        System.out.print("听着");
    }

    public Student() {
    }

    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
