package Day06;

public class D6t4 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("James");
        m.setNum(9527);
        m.setSalary(15000);
        System.out.println(m.getName());
        System.out.println(m.getNum());
        System.out.println(m.getSalary());
        m.work();
        System.out.println("-----------------");
        Coder c = new Coder();
        c.setName("Kobe");
        c.setNum(0025);
        c.setSalary(10000);
        System.out.println(c.getName());
        System.out.println(c.getNum());
        System.out.println(c.getSalary());
        c.work();

    }
}

    class Manager{
        private String name;
        private int num;
        private int salary;


        public String getName() {
            return name;
        }

        public int getNum() {
            return num;
        }

        public int getSalary() {
            return salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
        public void intro(){
            System.out.println("姓名:"+name+","+"工号:"+num);
        }
        public void showSalary(){
            System.out.println("薪资:"+salary);
        }
        public void work(){
            System.out.println("正在努力的做着管理工作,分配任务,检察员工提交上来的代码....");
        }
    }
    class Coder{
        private String name;
        private int num;
        private int salary;

        public String getName() {
            return name;
        }

        public int getNum() {
            return num;
        }

        public int getSalary() {
            return salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
        public void intro(){
            System.out.println("姓名:"+name+"工号:"+num);
        }
        public void showSalary(){
            System.out.println("薪资:"+salary);
        }
        public void work(){
            System.out.println("正在努力写代码......");
        }
    }

