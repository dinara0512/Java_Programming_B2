package day39_polymorphism;

public class Lizard extends Reptile {
    String skinColor;

    @Override
    public void eat() {
        System.out.println("REPTILLE is eating");
    }
}
