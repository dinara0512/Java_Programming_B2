package day08_scanner_logical_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int w= 78/2 * 2 + 3 - 5%5;
//        39 * 2+3 - 5%5
//        78   + 3 - 5%5
//        78  + 3-0
//        81 - 0
//        81

        int a = 8; // a= 7;
        int b = a--; //b = 8;
        int c= a++;
        System.out.println(a); //7
        System.out.println(b); // 8
        System.out.println("---------------");

        int l= 50; //49, 50, 49, 50;
        int p = --l + l++ + l-- + l++;
               // 49 + 49 + 50 + 49;
        System.out.println(l);
        System.out.println(p);
        System.out.println("---------------");

//        int r = 20;
//        int k = -r-- + r ++ + --r * r--%2;
//
//        /*      20 + 19 + 19 *19%2 ; (first increment / decrement)
//        /*      -20 + 19 + 19 *19%2 ;      (now add  negative sign if it has it and start calculation rules)
//        /*      -20 + 19 + 1;
//        /*      -1 + 1
//         /* 0;

//




    }
}