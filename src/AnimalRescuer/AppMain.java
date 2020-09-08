package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        // Dogs
        Dog dogOne = new Dog();
        dogOne.setName("Tasha");
        dogOne.setAge(2);
        dogOne.setFavouriteActivity("playing catch");
        dogOne.setFavouriteFood("beef can");
        dogOne.setHealth(8);
        dogOne.setHunger(9);
        dogOne.setStateOfMind(9);
        dogOne.setPersonalDoctor("Dolittle");
        System.out.println("--------------------------------");
        System.out.println("Dog's details:\n" + "Name: " + dogOne.getName() + "\n" +
                "Age: " + dogOne.getAge() + "\nFavourite food: " + dogOne.getFavouriteFood() + "\n" +
                "Favourite activity: " + dogOne.getFavouriteActivity() + "\nFavourite doctor: " + dogOne.getPersonalDoctor());
        dogOne.eat();
        dogOne.activity();
        dogOne.bark();

        Dog dogTwo = new Dog();
        dogTwo.setName("Bandit");
        dogTwo.setAge(12);
        dogTwo.setFavouriteActivity("stealing shoes");
        dogTwo.setFavouriteFood("french fries");
        dogTwo.setHealth(9);
        dogTwo.setHunger(10);
        dogTwo.setStateOfMind(9);
        dogOne.setPersonalDoctor("Dolittle");
        System.out.println("--------------------------------");
        System.out.println("Dog's details:\n" + "Name: " + dogTwo.getName() + "\n" +
                "Age: " + dogTwo.getAge() + "\nFavourite food: " + dogTwo.getFavouriteFood() + "\n" +
                "Favourite activity: " + dogTwo.getFavouriteActivity() + "\nFavourite doctor: " + dogTwo.getPersonalDoctor());
        dogTwo.run();
        dogTwo.activity();
        dogTwo.sleep();

        // Adopter
        Adopter girlOne = new Adopter();
        girlOne.setName("Ana Compton");
        girlOne.setAge(15);
        girlOne.setAvailableMoney(500);
        System.out.println("--------------------------------");
        System.out.println("Adopter's details:\n" + "Name: " + girlOne.getName() + "\n" +
                "Age: " + girlOne.getAge() + "\nAvailable money: " + girlOne.getAvailableMoney());
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
        dogFoodOne.setFoodName("Biscuits");
        dogFoodOne.setFoodDescription("crunchy");
        dogFoodOne.setPrice(5.5);
        dogFoodOne.setQuantity(10);
        dogFoodOne.setAvailability(true);
        System.out.println("--------------------------------");
        System.out.println("Food's details:\n" + "Food name: " + dogFoodOne.getFoodName() + "\n" +
                "Food description: " + dogFoodOne.getFoodDescription() + "\nPrice: " + dogFoodOne.getPrice() + "\n" +
                "Food quantity: " + dogFoodOne.getQuantity());
        dogFoodOne.setQuantity(0);
        dogFoodOne.setAvailability(false);
        System.out.println("Is "+ dogFoodOne.getFoodName() + " in stock: " + dogFoodOne.getAvailability());

        Food dogFoodTwo = new Food();
        System.out.println("--------------------------------");
        dogFoodTwo.setFoodName("Beef can");
        dogFoodTwo.setFoodDescription("Some details about beef can content.");
        dogFoodTwo.setPrice(20);
        dogFoodTwo.setQuantity(100);
        dogFoodOne.setAvailability(true);
        System.out.println("Food's details:\n" + "Food name: " + dogFoodTwo.getFoodName() + "\n" +
                "Food description: " + dogFoodTwo.getFoodDescription() + "\nPrice: " + dogFoodTwo.getPrice() + "\n" +
                "Food quantity: " + dogFoodTwo.getQuantity());

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
