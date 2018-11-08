package moni;

 class teacher extends Teach {
    String name;
    String course;

    public teacher() {
    }

    public teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public void teaching() {
        System.out.println("我是"+name+"老师,我教"+course+"学科");
    }
}
