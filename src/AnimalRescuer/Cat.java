package AnimalRescuer;

public class Cat extends Animal{
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void animalSound() {
        System.out.println("The cat makes miau, miau!");
    }

    public void eat() {
        System.out.println("Cats are meat eaters. But " + getName() + " loves eating " + getFavouriteFood() + ".");
    }

    public void activity() {
        System.out.println("Cats enjoy to play a lot. " + getName()+ " enjoys " + getFavouriteActivity() + ".");
    }

    public void sleep() {
        System.out.println("Cats sleep wherever they want.");
    }
}
