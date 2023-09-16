package day09_b_if_statements;


public class SingleIfExamples {
    public static void main(String[] args) {
        if (!false) {
            System.out.println("Hello World! "); // since our condition is false, the body of the if statement
            // (code block of if statement) is skipped

        }
        System.out.println("Second line");

        if (true) {
            //Since the condition is true, the code inside of the (if body) , will be executed
            System.out.println("Today is Saturday");

        }

        int score = 60;
        if (score >= 75) {// false
            System.out.println("you passed the exam");
        }

        if (score <= 75) { // false
            System.out.println(" You failed");
        }
        int year =2021;
        boolean isLockdown = year ==2020 || year ==2021;
        if (isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");

            if (!isLockdown) {
                System.out.println("Party");
                System.out.println("This is not a normal party. It is a Java Party");
                System.out.println("Travel");


            }


        }

    }
}