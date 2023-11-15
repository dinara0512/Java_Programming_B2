package day33_a_static;

public class BestBuy {
    String location;// instance variable
    static String headQuarter = "Minessota, US";
    static String day = "Saturday";

    public BestBuy(String location) {
        this.location = location;
    }






    public void openStore() {
        System.out.println("Opening " + location);
        System.out.println("Headquarter is " + headQuarter);
    }

    public static void countStock () {
        //System.out.println("Counting stock in " + location);
        System.out.println("Headquarter is " + headQuarter);
    }

}
// every object has its OWN copy of Instance variables
//Every object has the same copy of static variables