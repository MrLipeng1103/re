package Day09.D9t7;

public class test7 {
    public static void main(String[] args) {
        shopCar c1 = new shopCar();
        Goods g1 = new Goods("电脑", "g10000", 6999.0);
        Goods g2 = new Goods("键盘", "g10001", 199.0);
        Goods g3 = new Goods("鼠标", "g10002", 59.0);
        System.out.println("=============添加商品==============");
        c1.add(g1);
        c1.add(g2);
        c1.add(g3);
        System.out.println("您选购的商品为:");
        c1.showGoods();
        System.out.print("总计:");
        c1.getsum();
        System.out.println("=================移除鼠标============");
        c1.remove(g3);
        System.out.println("您选购的商品为:");
        c1.showGoods();
        System.out.print("总计:");
        c1.getsum();

    }
}
