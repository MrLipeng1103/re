package Day10.D10t2;

public interface A {
    abstract void showA();

   default void showB() {
       System.out.println("BBBB");
    }
}
