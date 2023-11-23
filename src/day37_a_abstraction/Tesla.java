package day37_a_abstraction;

public class Tesla extends ElectricCar {


    @Override
    public void charge(){
        System.out.println("Charging tesla");
    }

    @Override
    public void start(){
        System.out.println("Start remotely");
    }


}