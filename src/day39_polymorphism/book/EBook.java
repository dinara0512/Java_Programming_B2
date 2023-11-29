package day39_a_polymorphism.book;

import day39_polymorphism.book.Book;
import day39_polymorphism.book.Downloadable;

public abstract class EBook extends Book implements Downloadable {

    public double size; //mg

    public abstract void open();


}