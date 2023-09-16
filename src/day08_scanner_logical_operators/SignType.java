package day08_scanner_logical_operators;

public class SignType {
    public static void main(String[] args) {
        int num = 4;
        boolean isNegative = num > 0;
        boolean isPositive= num > 0;
        boolean isZero = num ==0;
        boolean isNotZero = num!= 0;


        System.out.println((num + " is negative: " + isNegative));
        System.out.println( num + "is postive : " + isPositive);
        System.out.println(num + " is zero: " + isZero);
        System.out.println(num + " is not zero : " + isNotZero);
    }
}
