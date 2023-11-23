package day37_a_abstraction;

public abstract class Exercise {
    String name;

    public Exercise (String name) {
        this.name = name;
    }

    public abstract void performExercise ();

    public abstract int caloriesBurned (int min);

    public void generalInfo (){
        System.out.println("Exercise if better for your health");
    }

}