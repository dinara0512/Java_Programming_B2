package day31_custom_classes;

public class UseMArker {
    public static void main(String[] args) {

        Marker marker1 = new Marker("Dry","Expo","Black");
        marker1.type = "";
        marker1.brand = "";
        marker1.color = "";

        Marker marker2 = new Marker("Wide", "Sharpie", "Green");
        System.out.println(marker2);


//        Marker marker3 = new Marker();
//        marker3.type = "";
//        marker3.brand = "";
//   /////     marker3.color = "";

    }
}