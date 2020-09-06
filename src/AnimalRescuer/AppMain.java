package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        // Dogs
        Dog dogOne = new Dog();
        System.out.println("--------------------------------");
        System.out.println("Dog's details:\n" + "Name: " + dogOne.name + "\n" +
                "Age: " + dogOne.age + "\nFavourite food: " + dogOne.favouriteFood + "\n" +
                "Favourite activity: " + dogOne.favouriteActivity + "\nFavourite doctor: " + dogOne.personalDoctor);
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
        System.out.println("--------------------------------");
        System.out.println("Dog's details:\n" + "Name: " + dogTwo.name + "\n" +
                "Age: " + dogTwo.age + "\nFavourite food: " + dogTwo.favouriteFood + "\n" +
                "Favourite activity: " + dogTwo.favouriteActivity + "\nFavourite doctor: " + dogTwo.personalDoctor);
        dogTwo.run();
        dogTwo.activity();
        dogTwo.sleep();

        // Adopter
        Adopter girlOne = new Adopter();
        System.out.println("--------------------------------");
        System.out.println("Adopter's details:\n" + "Name: " + girlOne.name + "\n" +
                "Age: " + girlOne.age + "\nAvailable money: " + girlOne.availableMoney);
        girlOne.adoptPet();
        girlOne.acquireFood();
        girlOne.tendPet();

        // Veterinarian
        Veterinarian docOne = new Veterinarian();
        System.out.println("--------------------------------");
        docOne.name = "Dolittle";
        System.out.println("Doctor's details:\n" + "Name: " + docOne.name + "\nSpecialization: " + docOne.specialization);
        docOne.applyTreatment();
        docOne.writePrescriptions();

        Veterinarian docTwo = new Veterinarian();
        System.out.println("--------------------------------");
        docTwo.name = "Strange";
        docTwo.specialization = "dentistry";
        System.out.println("Doctor's details:\n" + "Name: " + docTwo.name + "\nSpecialization: " + docTwo.specialization);
        docTwo.applyTreatment();
        docTwo.writePrescriptions();

        // Food
        Food dogFoodOne = new Food();
        System.out.println("--------------------------------");
        System.out.println("Food's details:\n" + "Food name: " + dogFoodOne.foodName + "\n" +
                "Food description: " + dogFoodOne.foodDescription + "\nPrice: " + dogFoodOne.price + "\n" +
                "Food quantity: " + dogFoodOne.quantity);
        dogFoodOne.quantity = 0;
        dogFoodOne.isAvailable = false;
        System.out.println("Is "+ dogFoodOne.foodName + " in stock: " + dogFoodOne.isAvailable);

        Food dogFoodTwo = new Food();
        System.out.println("--------------------------------");
        dogFoodTwo.foodName = "Biscuits";
        dogFoodTwo.foodDescription = "crunchy";
        dogFoodTwo.price = 5.5;
        dogFoodTwo.quantity = 10;
        System.out.println("Food's details:\n" + "Food name: " + dogFoodTwo.foodName + "\n" +
                "Food description: " + dogFoodTwo.foodDescription + "\nPrice: " + dogFoodTwo.price + "\n" +
                "Food quantity: " + dogFoodTwo.quantity);

        // Activity
        Activity activityOne = new Activity();
        System.out.println("--------------------------------");
        System.out.println("Activity conducted with a pet:\n" + "Activity name: " + activityOne.activityName + "\nRequired materials: " + activityOne.requiredMaterials);

        Activity activityTwo = new Activity();
        System.out.println("--------------------------------");
        activityTwo.activityName = "training";
        activityTwo.requiredMaterials = "leash, food, water";
        System.out.println("Activity conducted with a pet:\n" + "Activity name: " + activityTwo.activityName + "\nRequired materials: " + activityTwo.requiredMaterials);
    }
}
