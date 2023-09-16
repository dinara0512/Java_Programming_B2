package day09_b_if_statements;
import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Are  you hungry? ");
        boolean isHungry = input.nextBoolean();

        if(isHungry) {
            System.out.println("You are hungry, so I will order some food");
        } else {
            System.out.println("Great, go practice Java");

        }
    }
}
