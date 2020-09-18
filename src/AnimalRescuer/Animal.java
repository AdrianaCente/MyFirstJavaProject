package AnimalRescuer;

public class Animal {
    private String name;
    private float age;
    private String gender;
    private int health;
    private int hunger;
    private int stateOfMind;
    private String favouriteFood;
    private String favouriteActivity;
    private String personalDoctor;

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

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getStateOfMind() {
        return this.stateOfMind;
    }

    public void setStateOfMind(int stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    public String getFavouriteFood() {
        return this.favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return this.favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getPersonalDoctor() {
        return this.personalDoctor;
    }

    public void setPersonalDoctor(String personalDoctor) {
        this.personalDoctor = personalDoctor;
    }

    public void eat() {
        System.out.println(name + " loves eating " + favouriteFood + ".");
    }

    public void sleep() {
        System.out.println("Sleeping on the couch.");
    }

    public String isHungry() {
        String dogIsHungry = hunger > 8 ? name + " is hungry." : name + " is not so hungry...";
        return dogIsHungry;
    }

    public void activity() {
        System.out.println(name + " enjoys " + favouriteActivity + ".");
    }
}
