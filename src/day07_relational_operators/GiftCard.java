package day07_relational_operators;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = input.nextLine();
        int giftCard = 100;
        int blanket = 60;
        int pillow = 40;
        int charger = 5;
        int hat = 25;
        int headphones = 30;
        int laptop = 200;
        int pants = 50;
        int smartphone = 1000;
        int socks = 5;
        int usbCable = 10;


        switch (item) {
            case "blanket":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - blanket) + "$");
                break;
            case "pillow":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - pillow) + "$");
                break;
            case "charger":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - charger) + "$");
                break;
            case "hat":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - hat) + "$");
                break;
            case "headphones":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - headphones) + "$");
                break;
            case "laptop":
                System.out.println("Sorry, not enough funds on your gift card");
                break;
            case "pants":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - pants) + "$");
                break;
            case "smartphone":
                System.out.println("Sorry, not enough funds on your gift card");
                break;
            case "socks":
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - socks) + "$");
                break;
            case "usb cable":
                System.out.println("Thank you for your purchase!\nYour current balance is: "
                        + (giftCard - usbCable) + "$");
                break;
            default:
                System.out.println("Sorry, that is an invalid item");

        }
    }
}
