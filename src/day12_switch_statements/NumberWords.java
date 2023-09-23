package day12_switch_statements;

public class NumberWords {
//    public static void main(String[] args) {
//        int n = 3; // Number must be between 1 and 5 (inclusive)
//        // else-if statement
//        if (n==1) {
//            System.out.println("one");
//        } else if (n == 2) {
//            System.out.println("two");
//        } else if (n == 3) {
//            System.out.println("three");
//        } else if (n == 4) {
//            System.out.println("four");
//        }else if (n == 5) {
//            System.out.println("five");
//        } else {
//            System.out.println( " Invalid number ");
//        }
//
//
//        // switch statement
//        switch (n) {
//            case 1: // in if statement --> if (n ==1) {
//                System.out.println("one"); // not all data type will work with switch: string, char, int , short, byte only can be used in switch ;
//                // it will not work with boolean expression
//                break;
//            case 2:// Exact values cannot be duplicate- this will give Compile error
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            case 4 :
//                System.out.println("four");
//                break;
//            case 5 :
//                System.out.println("five");
//                break ;
//            default:
//
//        }
//    }
//
//}
    public static void main(String[] args) {

        int n = 2; // Number must be between 1 and 5 (inclusive)

        // elf-if statement ---- Number must be between 1 and 5 (inclusive)
        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid number");
        }
        System.out.println("----------------------");


        // switch statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
//            case 1:   // Exact values CANNOT be duplicate - this will give COMPILE ERROR
//                System.out.println("Two");
//                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 3:
                System.out.println("Three");
                break;
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
                break;
            case 4:
                System.out.println("Four");
                break;
        }



        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 3:
                System.out.println("Three");
                break;
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");
                break;
        }



        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 3:
                System.out.println("Three");
                break;
            case 1:  // in if statement: ---- >  if (n == 1) {
                System.out.println("One");
                break;
            case 2:   // Exact values CANNOT be duplicate
                System.out.println("Two");
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");
        }




        System.out.println("-------------------------");



        // switch statement - does not care about the order of the cases or default if ALL OF THEM have the break; statement
        switch (n) {  //  char, byte, short, int, String  | It will not work with boolean expression - we need EXACT value |
            case 2:  // in if statement: ---- >  if (n == 1) {
                System.out.println("ONumber is equal ot 2 or 3");
                break;
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");
        }
    }

}
