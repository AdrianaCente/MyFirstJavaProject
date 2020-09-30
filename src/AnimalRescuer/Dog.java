package AnimalRescuer;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void run() {
        System.out.println(getName() + " is running like crazy.");
    }

    public void bark() {
        System.out.println("Barks all day long.");
    }

    public void animalSound() {
        System.out.println("The dog makes woof, woof!");
    }

    public void eat() {
        System.out.println("Dogs like to eat fried chicken. But " + getName() + " loves eating " + getFavouriteFood() + ".");
    }

    public void activity() {
        System.out.println("Dogs enjoy going outside. " + getName()+ " enjoys " + getFavouriteActivity() + ".");
    }

    public void sleep() {
        System.out.println("Dogs sleep a lot on the couch.");
    }
}
