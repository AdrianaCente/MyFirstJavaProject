package AnimalRescuer;

public class Dog {
    String name = "Tasha";
    float age = 2;
    byte health = 8;
    byte hunger = 9;
    byte stateOfMind = 6;
    String favouriteFood = "beef can";
    String favouriteActivity = "playing catch";
    public void run() {
        System.out.println("Running like crazy.");
    }
    public void eat() {
        System.out.println(name + " loves eating " + favouriteFood + ".");
    }
    public void bark() {
        System.out.println("Barks all day long.");
    }
    public void sleep() {
        System.out.println("Sleeping on the couch.");
    }
    public void activity() {
        System.out.println(name + " enjoys " + favouriteActivity + ".");
    }
}
