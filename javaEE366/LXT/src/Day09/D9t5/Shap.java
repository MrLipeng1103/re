package Day09.D9t5;

public abstract class Shap {
    double chang;
    double kuan;
    double banjing;
    abstract void perimeter();
    abstract void area();

    public Shap() {
    }

    public Shap(double chang, double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    public Shap(double banjing) {
        this.banjing = banjing;
    }
}
