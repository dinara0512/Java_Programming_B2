package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

import javax.management.MBeanAttributeInfo;

public class Third {
    //DIFFERENT CLASS , DIFFERENT PACKAGE
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two); is not accessible because it is protected
//        System.out.println(obj.three); is not accessible bcs it is default
//        System.out.println(obj.four); is not accessible bcs its private
    }
}
