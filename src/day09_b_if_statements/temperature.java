package day09_b_if_statements;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = key.nextInt();// Here we are dynamically getting the value from user each time
       // int temp = 50; // Here we are manually changing the value. It is kind of HARD CODED

        boolean result = temp >= 70;
        if (result) {
            System.out.println("it is a nice day");
            System.out.println("go outside, but with your laptop to code java");
        }

        if  (temp < 70) {
            System.out.println("It is too cold");
            System.out.println("COde more Java");

        } else {
            System.out.println("it is too cold");
            System.out.println("code more java");
        }

    }
}
