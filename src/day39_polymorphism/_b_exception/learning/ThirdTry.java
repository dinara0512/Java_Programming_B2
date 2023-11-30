package day39_polymorphism._b_exception.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
        public static void main(String[] args) {

            Scanner input  = new Scanner(System.in);


            try {
                System.out.print("Enter number 1: ");
                int num1 = input.nextInt(); // 5

                System.out.print("Enter number 2: ");
                int num2 = input.nextInt();  // 2  | 0


                System.out.println("Division of num1/num2 is equal: " + num1/num2); // 5/2 =  2  | 5/0

            } catch (InputMismatchException obj) {
                obj.printStackTrace();
            } catch (ArithmeticException obj) {
                obj.printStackTrace();
            }



            // Possibilities of exceptions:
            //  1. MissMatchException -- > Five
            //  2. ArithmeticException


            System.out.println("DONE");



        }
    }
