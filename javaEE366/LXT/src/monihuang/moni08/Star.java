package monihuang.moni08;

public class Star extends Category {
    public Star() {
    }

    public Star(int id, String name, String category) {
        super(id, name, category);
    }

    @Override
    void work() {
        System.out.println("编号为"+getId()+"的"+getCategory()+"类演员"+getName()+"在演电视剧");
    }
}
