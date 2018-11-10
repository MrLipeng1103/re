package Day09.D9t7;

import java.util.ArrayList;

public class shopCar {
   ArrayList<Goods> list=new ArrayList<>();


    public shopCar() {
    }

    public shopCar(ArrayList<Goods> list) {
        this.list = list;
    }

    public void add(Goods goods) {
        list.add(goods);
    }

    public void remove(Goods goods) {
        list.remove(goods);
    }
    public  void showGoods(){
        for(int i=0;i<list.size();i++){
           Goods goods= list.get(i);
           goods.show();
        }
    }

    public void getsum() {
        double num=0;
        for (int i = 0; i < list.size(); i++) {
            num += list.get(i).getPrice();
        }
        System.out.println(" 总计:"+num+"元");
    }
}
