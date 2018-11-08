package Day06;

public class D6t5 {
    public static void main(String[] args) {
       Circle y=new Circle();
       y.setR(8);
       y.showArea();
       y.showPerimeter();
    }
}

class Circle {
    int r;
    double π = 3.14;

    public Circle() {

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea() {
        System.out.println("半径为:"+r+","+"面积为:" + π * r * r);
    }

    public void showPerimeter() {
        System.out.println("半径为:"+r+","+"周长:"+2 * π * r);
    }
}