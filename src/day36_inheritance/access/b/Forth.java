package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Forth  extends First{
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        Forth obj2 = new Forth();
        System.out.println(obj2.one);
        System.out.println(obj2.two);  // THIS LINE
//        System.out.println(obj2.three);
//        System.out.println(obj2.four);
    }


}
