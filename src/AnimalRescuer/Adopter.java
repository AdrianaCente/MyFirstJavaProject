package AnimalRescuer;

public class Adopter {
    private String name;
    private float age;
    private double availableMoney;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return this.age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public double getAvailableMoney() {
        return this.availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

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
