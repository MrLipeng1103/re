package moni;

public class test3_2 {
    public static void main(String[] args) {
        teacher t1 = new teacher("YY","ZZ");
        Student s1 = new Student("XX",62,t1);
        t1.teaching();
        s1.getMyResult();
    }
}
