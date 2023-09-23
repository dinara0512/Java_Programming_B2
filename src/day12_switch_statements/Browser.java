package day12_switch_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        System.out.print("Enter your browser: ");
        Scanner input = new Scanner(System.in);
        String browser = input.nextLine(); // in case we have multiple words
        System.out.print("Enter your URL: ");
        String url = input.nextLine();


        switch (browser) {
            case "chrome":
                System.out.println("Opening" + url + "in the " + browser + "browser");
                System.out.println("Loading...");
                break;
            case "Edge":
                System.out.println("Opening" + url + "in the " + browser + "browser");
                System.out.println("Loading....");
                break;
            case "Safari":
            case "SaFaRi":
            case "SAFARI":
                System.out.println("Opening: " + url + " in the " + browser + " browser");
                System.out.println("Welcome");
                break;
            case "Firefox":
                System.out.println("Opening" + url + "in the " + browser + "browser");
                System.out.println("Welcome");
                break;
            default:
                System.out.println(browser + " is not a valid browser type");

        }
    }
}
