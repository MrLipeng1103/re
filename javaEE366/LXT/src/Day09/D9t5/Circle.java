package Day09.D9t5;

public class Circle extends Shap {
    public Circle() {
    }

    public Circle(double banjing) {
        super(banjing);
    }

    @Override
    void perimeter() {
        double zhouchang = 2 * 3.14 * banjing;
        System.out.println(zhouchang);
    }

    @Override
    void area() {
        double mianji = 3.14 * banjing * banjing;
        System.out.println(mianji);
    }
}
