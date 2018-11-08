package Day06;

public class D6t3 {
    public static void main(String[] args) {
        Card a = new Card("黑桃", "A");
        a.show();

    }
}

class Card {
    private String huase;
    private String dianshu;

    public Card(String huase, String dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }

    public void show() {
        System.out.println(huase + dianshu);
    }
}



