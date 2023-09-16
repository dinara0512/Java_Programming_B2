package day09_a_scanner;

import java.util.Scanner;

public class Revenue {

        /*
        write a program that asks the user to enter a price and quantity and then calculate the revenue.
        Calculation: revenue = price * quantity

         */
        public static void main(String[] args) {
            // 1) First I need to import the package that has the Scanner  class in it
            // 2) Then I need to create an OBJECT of the Scanner class

            //*) If I want to use a class from a different package, I need to import it
            //*) If I want to use anything from that class, I need to create the object of it.

            Scanner input = new Scanner (System.in);// input ---> is reference to object (the input can be any other word. this is not data type, is an object)
            // This is object - Scanner input = new Scanner (System.in);
            System.out.println("Enter the price: $");
            double price = input.nextDouble();
            System.out.println("Enter the quantity: ");
            int quantity = input.nextInt();

            System.out.println("Revenue: $" + price * quantity);


    }
}
