package day07_relational_operators;

import java.sql.SQLOutput;

public class OperatorPractice2 {
    public static void main (String [] args) {
        int a = 40; // after update it is a--> 39,
        // then second line update it become 38; the after third line update is 37;
       // aFTER LINE 4 IS 36, 35,35, 34

        System.out.println(--a); // pre-decrement ---. output:39
        System.out.println(--a); // output: 38
        System.out.println(a--); // output:38
        System.out.println(--a); // 36
        System.out.println(--a); //35
        System.out.println(a--);//35

        System.out.println(a); // output:34






    }
}
