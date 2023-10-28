package day23_multidemensional_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] a = {1,2,3}; // This is in one location in the memory
        int [] b = {1,2,3}; // This is in another location in the memory
        int [] c =a;
        System.out.println(a==b); // If you use arithmetic operator to compare , it will compre the memroy location
        System.out.println(a==c);
        //How can I comparae the values of the arrays?
        System.out.println(Arrays.equals (a,b));
        //System.out.println(a.equals(b));// We cannot use just the .equals() method with arrays


        int [] d= {3,2,1};
        System.out.println(Arrays.equals(a,d));
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));

    }
}
