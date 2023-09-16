package day09_a_scanner;
import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" What is today? ");
        String day = input.nextLine ();
        System.out.println("Enter your first name:");
        String name = input.next ();

        System.out.println("Today: " + day);
        System.out.println("First Name: " + name);

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        input.nextLine();
        System.out.println("Enter your address:");
        String address = input.nextLine();

        System.out.println("Enter your bank account username: ");
        String userName= input.nextLine(); //Since the one Before is also same as nextLne, we do not need to handle it.
        //The problem when there ANY OTHER scanner method that the nextline ()

        System.out.println("Lastname: " + lastName);
        System.out.println("Address:" + address);
        System.out.println(" Your bank username: " + userName);
    }
}
