package day09_b_if_statements;
import java.util.Scanner;
public class bankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your balance?"); //100_000
        double balance = input.nextDouble();

        System.out.println("How much do you want to withdraw?");// 10_000
        double withdraw = input.nextDouble();
        balance -= withdraw; // balance=balance - withdraw;

        if(balance < 0) {
            System.out.println(" You took out too much.");
            System.out.println("You owe us: " + balance);
        } else {
            System.out.println("your new balance is $" + balance);
        }

    }
}
