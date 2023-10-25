package day24_methods;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [] [] groups = new String [4] []; //have to declare how many arrays will have in 1st [], doesnt have to in next ones, but you can, if there is no arrays declare, there will be no default null
        //String [] [] group2 = new String[4] [3];
// [ [ null, null, null], [null, null, null], [null, null, null], [null, null, null] - null is a default arrays
        System.out.println(Arrays.deepToString(groups));
        System.out.println();

        String [] group1 = {"Gular", "Maya", "Parvana"};
        groups [0] =group1;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 2......");
        String [] group2 = {"Iryna", "Aytaj", "Elturk", "Anna"};
        groups[1] = group2;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 3.....");
        String [] group3 = {"Ulvi", "Ramiz" , "Natalia"};
        groups [2]=group3;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 4....");
        String [] group4 ={"Ulvi"};
        groups [3] = group4;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("==========================");
        for ( String [] eachElem : groups ) {
            System.out.println(Arrays.toString(eachElem));
        }

        //With Traditional Loop
        for (int i=0; i < groups.length;i++){
            System.out.println(Arrays.toString(groups[i]));

            System.out.println("==========================");
            for (String [] eachArray : groups) { //Outer Loop:cycles through 2D array, get each array
                for (String eachName : eachArray) { // Inner loop: cycles through each array , get each value

                    System.out.println(eachName);
                }
            }


//            int [] nums = {1,2,3,4,34};
//            for (int each : nums)

        }




    }
}
