package day09_a_scanner;

import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.println("Please, enter a product name: ");
        String productName = key.nextLine();
        System.out.println("Enter a price for a " + productName + ":");
        double price = key.nextDouble();

        System.out.print(" How many " + productName + " do you want to buy?");
        int quantity = key.nextInt();

        key.nextLine(); // I want the ENTER to be handled here.
        System.out.println("What should we put on your order name:");
        String orderName = key.nextLine ();


        //"$orderName, your order for  $quantity $productName has been placed. your total is $totalCost (price * quantity)."
        System.out.println(orderName + " your order for " + quantity + " " + productName + " has been placed. Your total is " + price * quantity);



    }

}
