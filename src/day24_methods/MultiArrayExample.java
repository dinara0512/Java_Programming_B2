package day24_methods;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {


        int[] nums1 = {5, 10, 20, 10};// 4 elements
        int[] nums2 = {5, 10, 100, 39, 19}; //5 elements
        System.out.println(nums1);//WRONG some hashcode
        System.out.println(Arrays.toString(nums1));

        int[][] all = {nums1, nums2}; //2
        System.out.println(all);// WRONG some hashcode
        System.out.println(Arrays.deepToString(all)); //CORRECt

        System.out.println("First Array in 2d array: " + Arrays.toString(all[0]));
        System.out.println("Second Array in 2d array " + Arrays.toString(all[1]));
        System.out.println();
        int [] [] multi = {
                {90,30,20}, //0
                {23,12,15,1456,32,23}, //1
                {23,2345},//2
                {14}//index 3 of array but only 1 element
        };
// in This 2D array, how many elements I have / what is the size? 4
        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(Arrays.deepToString(multi));
        System.out.println(multi[3].length);
        System.out.println(multi[3][0]);

    }
}