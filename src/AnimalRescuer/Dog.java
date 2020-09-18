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
}
