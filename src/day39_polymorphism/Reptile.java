package day39_polymorphism;

public class Reptile extends Animal{
    int numberOfClaws;

    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }
}
