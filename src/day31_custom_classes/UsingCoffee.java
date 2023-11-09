package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {


        Coffee coffee1 = new Coffee();
        coffee1.price = 5.99;
        coffee1.size = 16;
        coffee1.brand = "Lavazza";
        coffee1.type = "Espresso";

        System.out.println();
        System.out.println(coffee1);
        coffee1.drink();
        coffee1.refill(2);
        coffee1.refill(4);
        System.out.println(coffee1);
    }
}