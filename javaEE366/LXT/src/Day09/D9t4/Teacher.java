package Day09.D9t4;

public class Teacher extends Person {
    String subject;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String subject) {
        this.subject = subject;

    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teacher(){
        System.out.println(name+"老师,讲授"+subject);
    }
}
