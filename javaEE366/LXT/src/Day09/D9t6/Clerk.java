package Day09.D9t6;

public class Clerk extends Employee{
    private Manager manager;

    public Clerk() {
    }

    public Clerk(Manager manager) {
        this.manager = manager;
    }

    public Clerk(String num, String name, String bumen) {
        super(num, name, bumen);
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void show() {
        System.out.println(bumen+"的:"+name+",员工编号:"+num+"他的经理是"+manager.getName());
    }
}
