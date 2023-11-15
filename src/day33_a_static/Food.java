package day33_a_static;

public class Food {
    //name quantity
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    @Override
    public String toString() {
        return "Food name: " + name +
                "\n\tQuantity: " + quantity +
                "\n\tUnitPrice: " + unitPrice +
                "\n\tTotal Price: " + totalPrice;
    }

    public Food(String name) {
        this.name = name;
        calculatePrice();
    }

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        calculatePrice();
    }

    public Food(String name, int quantity, double unitPrice) {
        this (name,quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public Food(String name, int quantity, double unitPrice, double totalPrice) {
        this (name,quantity, unitPrice);
        this.totalPrice = totalPrice;
        calculatePrice();
    }
    public void calculatePrice () {
        totalPrice = unitPrice*quantity;
    }
}
