package day07_relational_operators;

public class Pizza {
    public static void main (String[] args) {
        String typeOfPizza="Cheese";
        int numOfSlice =10;
        int numOfPeople = 4;

        int slicesForEachPerson =numOfSlice/numOfPeople; //10/4 ---> 2
        int slicesLeftOver= numOfSlice%numOfPeople; // 10%4 ---> 2

        String report = " We ordered " + typeOfPizza + " pizza with " + numOfSlice +  " slices."
                +numOfPeople + " people ate " + slicesForEachPerson + " for each, there were " + slicesLeftOver +
                " slices left";

        System.out.println(report);


    }

}
