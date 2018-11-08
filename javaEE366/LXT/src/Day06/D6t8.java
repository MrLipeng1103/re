package Day06;

import com.sun.org.apache.xpath.internal.SourceTree;

public class D6t8 {
    public static void main(String[] args) {
        Book b1 = new Book("No00001", "python实战", 48415315, 50.6, "2017-02-03");
        Book b2 = new Book("No00002", "JAVAweb实战", 4845515, 58.8, "2017-01-01");
        Book b3 = new Book("No00002", "大数据实战", 48466815, 56.8, "2017-02-01");
        double c = (b1.getPrice()>b2.getPrice()?(b1.getPrice()>b3.getPrice()?b1.getPrice():b3.getPrice()):(b2.getPrice()>b3.getPrice()?b2.getPrice():b3.getPrice()));
    if(c==b1.getPrice()){
        b1.showBook();
    }else if(c==b2.getPrice()){
        b2.showBook();
    }else{
        b3.showBook();
    }
    }
}
class Book {
    private String num;
    private String name;
    private int ISBN;
    private double price;
    private String date;

    public Book() {
    }

    public Book(String num, String name, int ISBN, double price, String date) {
        this.num = num;
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
        this.date = date;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showBook() {
        System.out.println(num + "," + name + "," + ISBN + "," + price + "," + date);
    }
}

