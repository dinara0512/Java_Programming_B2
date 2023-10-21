package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        //When you make an array with 'new' keyword, you Must give the size of it
        // each element will have a default values depending on the data type of array
        double [] arr = new double [4];// There will be total 4 elements in this array
        System.out.println(arr.length);//4
        System.out.println(Arrays.toString(arr));


        // How can I assign 30.99 to index 0
        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));
        arr [1] =12.55;
        arr[2]=10.20;
        arr [3]=4;
        System.out.println(Arrays.toString(arr));
        //arr[4] = 45;// since index 4 is not in the range , it will throw ExceptionOut Of Bounds

        // we said that we cannot change the size of array
        //but can we change the value of the specific indexed element
 arr[2]=200.0;
        System.out.println(Arrays.toString(arr));

        arr= new double[5];//This creates a new array with 5 elements
        //And arr references to the new object
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr[]);


        //3rd but very rare declaration
        char[] arr2 = new char[] {1,5,6,8};
        System.out.println(arr2.length);

    }
}
