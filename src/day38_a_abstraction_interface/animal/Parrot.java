package day38_a_abstraction_interface.animal;
public class Parrot extends Bird implements Flyable {
    public void eat(){
        System.out.println("Parrots each with their beaks");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HI HI");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE");
    }
}
