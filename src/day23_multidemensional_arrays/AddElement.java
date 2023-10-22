package day23_multidemensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Ask a user : how many element do you want to have in an array?
I need to make an array with that size
 */
public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("How many elements do you want ot have in an array? ");
        int size = input.nextInt();//5

        int[] arr = new int [size]; // I made a new array with size that user gave -> 3
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter Value for index of: " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Array so far " + Arrays.toString(arr));

        //Add one more lement which is 100 to the elements that user gave
        int [] arr2 = Arrays.copyOf(arr, arr.length+1);
        arr2[arr.length -1] = 100;
        System.out.println("New Arrr with addiiton: " + Arrays.toString(arr2));
    }
}
