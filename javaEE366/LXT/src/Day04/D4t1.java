package Day04;

public class D4t1 {
    public static void main(String[] args){
        int a=10,b=10;
        printNum(a,b);
        doubling(a,b);
        printNum(a,b);
        a=doubling(a);
        b=doubling(b);
        System.out.println("***********************");
        printNum(a,b);
    }
    public static void printNum(int iVar,int iVar2){
        System.out.print("iVar:"+iVar+",");
        System.out.println("iVar2:"+iVar2);
    }
    public static void doubling(int r,int p){
        r*=2;
        p*=2;
        System.out.print("翻倍:r="+r+",");
        System.out.println("p="+p);
    }
    public static int doubling(int r){
        r*=2;
        return r;
    }
}
