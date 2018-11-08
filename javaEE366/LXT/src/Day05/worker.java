package Day05;

public class worker {
    private String name;
    private int age;
    private int salary;

    public void show(){
        System.out.println("姓名:"+name+",年龄:"+age+",工资:"+salary);
    }

    public worker() {
    }

    public worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
