package day39_polymorphism.book;


public class JavaTextBook extends day39_a_polymorphism.book.EBook {

    boolean isFun;

    @Override
    public void read () {
        System.out.println("Reading Java Text Book");
    }

    public void download(){
        System.out.println("Downloading Java Text Book");
    }

    public void open () {
        System.out.println("Opening Java Text Book");
    }
}