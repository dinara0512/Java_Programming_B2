package day23_multidemensional_arrays;

public class AWS {
    public static void main(String[] args) {
        String zones ="us-east1, us-west1, us-south1, us-north1";
        String app = "Etsy";
        //Required output: "application is deploying on$us-east1"
        // I need to first get each zone  -- I can use .split method to separate each zone and store all of them into an array


        // with foreach loop
        String [] zoneArr= zones.split(", "); // ["us-east1", "us-west1", ....]--> size:4
        for (String each :zoneArr) {
            System.out.println(app + "is deploying on " + each);
        }
        //With traditional loop/ fori loop
        System.out.println("============================================");
        for (int i=0; i<zoneArr.length; i++){
            System.out.println((app + " is deploying on " + zoneArr[i]));

        }


    }
}
