package Day09.D9t6;

public class Manager extends Employee {
    private Clerk clerk;

    public Manager() {
    }

    public Manager(Clerk clerk) {
        this.clerk = clerk;
    }

    public Manager(String num, String name, String bumen) {
        super(num, name, bumen);
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void show() {

        System.out.println(bumen+"的:"+name+",员工编号:"+num+"他的职员是"+clerk.getName());
    }
}
