package monihuang.moni08;

public class Director {
    private int age;
    private String name;

    public Director() {
    }

    public Director(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void letPlay(Actor a){
        Star star = new Star(1,"刘亦菲","表演类");
        System.out.println("导演："+getName()+"正在导戏");
        a.level();
        Actor.study();
        a.play(star);
    }
}
