package AnimalRescuer;

public abstract class Adopter extends Human{
    private double availableMoney;

    public abstract void tendPet();

    public double getAvailableMoney() {
        return this.availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void adoptPet() {
        System.out.println(getName() + " adopted a friend.");
    }

    public void acquireFood() {
        System.out.println("Buy tasty food.");
    }
}
