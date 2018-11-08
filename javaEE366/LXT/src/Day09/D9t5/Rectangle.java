package Day09.D9t5;

public class Rectangle extends Shap {
    public Rectangle() {
    }

    public Rectangle(double chang, double kuan) {
        super(chang, kuan);
    }

    @Override
    void perimeter() {
        double zouchang = (chang + kuan) * 2.0;
        System.out.println(zouchang);
    }
    @Override
    void area() {
        double mianji = chang * kuan;
        System.out.println(mianji);
    }
}
