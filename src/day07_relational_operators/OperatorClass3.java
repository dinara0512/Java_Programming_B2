package day07_relational_operators;

public class OperatorClass3 {
    public static void main(String[] args) {
        int h=5; // i declared an int variable called h and assign a value 5 to it.
        int p = h;// i declared an int variable called p and assign a value from variable h
        h++; // post increment no other code | Just increase by 1

        System.out.println(h); //Output:6
        System.out.println(p); //output: 5

        int k = h++;//
        System.out.println("h: "+h );// 7
        System.out.println("k: " + k);// 6
        System.out.println("k = " + k);

        int g = ++h; //g:8
        System.out.println("h: " + h);
        System.out.println("g: " + g);





    }
}
