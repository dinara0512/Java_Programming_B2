package day33_a_static;

import my_utilities.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {


        Food f1 = new Food("Apples");
        Food f2 = new Food("Apples");
        Food f3 = new Food("Banana", 10, 0.99);
        System.out.println(f3);
        Food f4 = new Food("Apples", 3, 2.55);
        System.out.println(f4);

        System.out.println("=====================");
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        System.out.println(foodList);
        for (Food each : foodList){
        System.out.println(each);
        System.out.println();
}
        System.out.println("-------------------");
        ArrayList<Food> foodPriceNotZero = new ArrayList<>();
        foodPriceNotZero.removeIf (each-> each.totalPrice ==0.0);
        for (Food each : foodPriceNotZero) {
            System.out.println(each);
        }



    }
}
