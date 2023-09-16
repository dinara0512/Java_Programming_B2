package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Tom Jerry";
        boolean isCitizen = true;
        boolean isNotCriminal = false;
        int age = 30;

        boolean isEligible = isCitizen && isNotCriminal && age >=18;
        System.out.println (name + "is eligible to vote:" +isEligible);


    }
}
