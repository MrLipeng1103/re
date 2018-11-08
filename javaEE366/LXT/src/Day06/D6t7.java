package Day06;

public class D6t7 {
    public static void main(String[] args) {
        Cat c1 = new Cat(5, '黑');
        Cat c2 = new Cat(5, '白');
        c1.showMsg();
        c2.showMsg();
        if (c1.getAge() == c2.getAge() && c1.getColor() == c2.getColor()) {
            System.out.println("属性相同?" + true);
        } else {
            System.out.println("属性相同?" + false);
        }
    }
}

class Cat {
    private int age;
    private char color;

    public Cat() {
    }

    public Cat(int age, char color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void showMsg() {
        System.out.println("年龄:" + age + "," + "颜色:" + color);
    }
}
