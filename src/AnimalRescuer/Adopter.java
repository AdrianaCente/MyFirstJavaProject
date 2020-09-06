package AnimalRescuer;

public class Adopter {
    String name = "Ana Compton";
    float age = 18;
    double availableMoney = 500;
    public void acquireFood() {
        System.out.println("Buy tasty food.");
    }
    public void adoptPet() {
        System.out.println(name + " adopted a friend.");
    }
    public void tendPet() {
        System.out.println("Provide for the pet.");
    }
}
