package Day09.D9t6;

public class Employee {
    String num;
    String name;
    String bumen;

    public Employee() {
    }

    public Employee(String num, String name, String bumen) {
        this.num = num;
        this.name = name;
        this.bumen = bumen;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public void show(){
        System.out.println(bumen+"的:"+name+",员工编号:"+num);
    }
}
