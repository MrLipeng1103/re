package Day09.D9t7;

public class Goods {
    private String name;
    private String id;
    private double price;
    public void show(){
        System.out.println("商品名称:" +name);
        System.out.println("\tid:" +id);
        System.out.println("\t价格:" +price);
    }

    public Goods() {
    }

    public Goods(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
