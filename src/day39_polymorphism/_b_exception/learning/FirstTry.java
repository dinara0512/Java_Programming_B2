package day39_polymorphism._b_exception.learning;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First Line");
        try {
            String word = "java";
            System.out.println(word.charAt(6));
        } catch (Exception e) {
            System.out.println("Exception happened");
        }

        System.out.println("Last Line");

    }
}