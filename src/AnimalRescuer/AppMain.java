package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        System.out.println("---------------------------");
        System.out.println("Dog's details:\n" + "Name: " + dogOne.name + "\n" +
                "Age: " + dogOne.age + "\nFavourite food: " + dogOne.favouriteFood + "\n" +
                "Favourite activity: " + dogOne.favouriteActivity);
        dogOne.eat();
        dogOne.activity();
        dogOne.bark();
        Dog dogTwo = new Dog();
        dogTwo.name = "Bandit";
        dogTwo.age = 12;
        dogTwo.favouriteActivity = "stealing shoes";
        dogTwo.favouriteFood = "french fries";
        dogTwo.health = 9;
        dogTwo.hunger = 10;
        dogTwo.stateOfMind = 9;
        System.out.println("---------------------------");
        System.out.println("Dog's details:\n" + "Name: " + dogTwo.name + "\n" +
                "Age: " + dogTwo.age + "\nFavourite food: " + dogTwo.favouriteFood + "\n" +
                "Favourite activity: " + dogTwo.favouriteActivity);
        dogTwo.run();
        dogTwo.activity();
        dogTwo.sleep();

        Adopter girlOne = new Adopter();
        System.out.println("---------------------------");
        System.out.println("Adopter's details:\n" + "Name: " + girlOne.name + "\n" +
                "Age: " + girlOne.age + "\nAvailable money: " + girlOne.availableMoney);
        girlOne.adopt();
        girlOne.acquireFood();
        girlOne.tendPet();


    }
}
