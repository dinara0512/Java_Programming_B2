package day24_methods;

public class AverageOfEach {
    public static void main(String[] args) {
        int [] [] nums ={
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };
        System.out.println(nums.length);//3
        System.out.println(nums[2].length);//3

        //what is the average of total
        //average : totalSum/totalLength
        int sum = 0;
        int totalLength =0;

        for (int [] eachArr:nums ) {
            for (int eachNum :eachArr) {
                sum += eachNum;
            }
                //totalLength+= eachArr.length;

                totalLength+= eachArr.length;
            System.out.println("Sum after each cycle: " +sum);
            System.out.println("Average of each:" + (sum/totalLength));
            }
            System.out.println("Total Sum: " + sum);
            int average =sum/totalLength;
            System.out.println ("Average " + (sum / totalLength));
            System.out.println ("Average " + average);
        }
    }

