package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    /*
 Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What day of week is it and what it is about?");
        String day = input.next();
        String result = "";

        switch (day) {
            case "monday":
                result = " No classes for now. but it will soon start.\nIt will be mentor sessions from 7pm - 10 pm EST.";
                break;
            case " tuesday":
                result = "No classes. champions league doing java task ";
                break;
            case "Wednesday":
                result = " we are having Java classes with Feyruz";
                break;
            case "Thursday":
                result = " We are having Java classes with Feyruz";
                break;
            case " Friday":
                result = " No clases but ger ready for Saturday long hours";
                break;
            case " Saturday":
                result = " Its kind of no class. but still important";
                break;
            default:
                result = "not invalid day of week";
                break;
        }
            System.out.println ( result );


    }
}
