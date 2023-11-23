package day36_inheritance.access.a;

import org.w3c.dom.ls.LSOutput;

public class Second {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
       // System.out.println(obj.four);
        //four is not accessible because it is private
        //private make it visible ONLY in the same class
    }
}