package monihuang.moni08;

public interface Actor {
    abstract void play(Star star);
    default void level(){
        System.out.println("机会总是留给有准备的人");
    }
    static void study(){
        System.out.println("敏而好学，不耻下问");
    }
}
