package monihuang.moni01;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        ArrayList<Student>list3=new ArrayList<>();
        Student s1 = new Student("张三",18,90);
        Student s2 = new Student("李四",28,80);
        Student s3= new Student("王五",38,50);
        list.add(s1);
        list.add(s2);
        list.add(s3);
       filterStudent(list,60);
       list3=filterStudent(list,60);
        for(int j=0;j<list3.size();j++) {
            System.out.print(list3.get(j).getName()+" ");
            System.out.print(list3.get(j).getAge()+" ");
            System.out.println(list3.get(j).getScore());

        }
    }
    public static ArrayList<Student> filterStudent(ArrayList<Student> list, int score){
        ArrayList<Student>list2=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getScore()>60){
                list2.add(list.get(i));
            }
        }return list2;
    }
}
