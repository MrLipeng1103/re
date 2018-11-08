package Day09.D9t4;

public class Student extends Person {
    int num;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(int num) {
        this.num = num;
    }

    public Student(String name, int age, int num) {
        super(name, age);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void defen(){
        System.out.println(name+"同学,考试得了:"+num+"分");
    }
}
