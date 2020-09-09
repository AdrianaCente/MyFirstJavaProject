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
        dogOne.setBreed("beagle");
        dogOne.setStateOfMind(9);
        dogOne.setPersonalDoctor("Dolittle");
        System.out.println("\n--------------------------------\nDog's details:" +
                "\n--------------------------------\n");
        System.out.println("Name: " + dogOne.getName() + "\n" +
                "Age: " + dogOne.getAge() + "\nFavourite food: " + dogOne.getFavouriteFood() + "\n" +
                "Favourite activity: " + dogOne.getFavouriteActivity() + "\nFavourite doctor: " + dogOne.getPersonalDoctor());
        dogOne.eat();
        dogOne.activity();
        dogOne.bark();
        System.out.println(dogOne.getName() + " is a " + dogOne.getBreed() + ". She is " + dogOne.getAge() + " years old and has been " +
                "brought to the shelter 2 weeks ago. \nShe enjoys " + dogOne.getFavouriteActivity() + " and her favourite food" +
                " is " + dogOne.getFavouriteFood() + ". The doctor that takes care of her health is " + dogOne.getPersonalDoctor() + ".");

        Dog dogTwo = new Dog();
        dogTwo.setName("Bandit");
        dogTwo.setAge(12);
        dogTwo.setBreed("husky");
        dogTwo.setFavouriteActivity("stealing shoes");
        dogTwo.setFavouriteFood("french fries");
        dogTwo.setHealth(9);
        dogTwo.setHunger(10);
        dogTwo.setStateOfMind(9);
        dogTwo.setPersonalDoctor("Strange");
        System.out.println("--------------------------------");
        System.out.println("Name: " + dogTwo.getName() + "\n" +
                "Age: " + dogTwo.getAge() + "\nFavourite food: " + dogTwo.getFavouriteFood() + "\n" +
                "Favourite activity: " + dogTwo.getFavouriteActivity() + "\nFavourite doctor: " + dogTwo.getPersonalDoctor());
        dogTwo.run();
        dogTwo.activity();
        dogTwo.sleep();
        System.out.println(dogTwo.getName() + " is a " + dogTwo.getBreed() + ". He is " + dogTwo.getAge() + " years old and has been " +
                "brought to the shelter 1 month ago. \nHe enjoys " + dogTwo.getFavouriteActivity() + " and his favourite food" +
                " is " + dogTwo.getFavouriteFood() + ". The doctor that takes care of his health is " + dogTwo.getPersonalDoctor() + ".");

        //Cat
        Cat catOne = new Cat();
        catOne.setName("Bilbo");
        catOne.setAge(3);
        catOne.setColor("black");
        catOne.setGender("male");
        catOne.setFavouriteActivity("hiding");
        catOne.setFavouriteFood("milk");
        catOne.setHealth(8);
        catOne.setStateOfMind(9);
        catOne.setPersonalDoctor("Dolittle");
        System.out.println("\n--------------------------------\nCat's details:" +
                "\n--------------------------------\n");
        System.out.println("Name: " + catOne.getName() + "\n" +
                "Age: " + catOne.getAge() + "\nFavourite food: " + catOne.getFavouriteFood() + "\nGender: " + catOne.getGender() + "\nColor: " + catOne.getColor() + "\n" +
                "Favourite activity: " + catOne.getFavouriteActivity() + "\nFavourite doctor: " + catOne.getPersonalDoctor());
        catOne.eat();
        catOne.activity();
        System.out.println(catOne.getName() + " is a " + catOne.getColor() + " cat. He is " + catOne.getAge() + " years old and has been " +
                "brought to the shelter 2 months ago. \nHe enjoys " + catOne.getFavouriteActivity() + " and his favourite food" +
                " is " + catOne.getFavouriteFood() + ". The doctor that takes care of his health is " + catOne.getPersonalDoctor() + ".");

        // Adopter
        Adopter girlOne = new Adopter();
        girlOne.setName("Ana Compton");
        girlOne.setAge(15);
        girlOne.setAvailableMoney(500);
        System.out.println("\n--------------------------------\nAdopter's details:" +
                "\n--------------------------------\n");
        System.out.println("Name: " + girlOne.getName() + "\n" +
                "Age: " + girlOne.getAge() + "\nAvailable money: " + girlOne.getAvailableMoney());
        girlOne.adoptPet();
        girlOne.acquireFood();
        girlOne.tendPet();

        Adopter boyOne = new Adopter();
        boyOne.setName("John Doe");
        boyOne.setAge(30);
        boyOne.setAvailableMoney(730);
        System.out.println("--------------------------------");
        System.out.println("Name: " + boyOne.getName() + "\n" +
                "Age: " + boyOne.getAge() + "\nAvailable money: " + boyOne.getAvailableMoney());
        boyOne.adoptPet();
        boyOne.acquireFood();
        boyOne.tendPet();

        // Veterinarian
        Veterinarian docOne = new Veterinarian();
        System.out.println("\n--------------------------------\nDoctor's details:" +
                "\n--------------------------------\n");
        docOne.setName("Dolittle");
        docOne.setSpecialization("behaviour");
        System.out.println("Name: " + docOne.getName() + "\nSpecialization: " + docOne.getSpecialization());
        docOne.applyTreatment();
        docOne.writePrescriptions();

        Veterinarian docTwo = new Veterinarian();
        System.out.println("--------------------------------");
        docTwo.setName("Strange");
        docTwo.setSpecialization("dentistry");
        System.out.println("Name: " + docTwo.getName() + "\nSpecialization: " + docTwo.getSpecialization());
        docTwo.applyTreatment();
        docTwo.writePrescriptions();

        // Food
        Food dogFoodOne = new Food();
        dogFoodOne.setFoodName("Biscuits");
        dogFoodOne.setFoodDescription("crunchy");
        dogFoodOne.setPrice(5.5);
        dogFoodOne.setQuantity(10);
        dogFoodOne.setAvailability(true);
        System.out.println("\n--------------------------------\nFood's details:" +
                "\n--------------------------------\n");
        System.out.println("Food name: " + dogFoodOne.getFoodName() + "\n" +
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
        System.out.println("Food name: " + dogFoodTwo.getFoodName() + "\n" +
                "Food description: " + dogFoodTwo.getFoodDescription() + "\nPrice: " + dogFoodTwo.getPrice() + "\n" +
                "Food quantity: " + dogFoodTwo.getQuantity());

        // Activity
        Activity activityOne = new Activity();
        activityOne.setActivityName("walk in the park");
        activityOne.setRequiredMaterials("leash, toy, water");
        System.out.println("\n--------------------------------\n" +
                "Activity conducted with a pet:\n--------------------------------\n");
        System.out.println("Activity name: " + activityOne.getActivityName() + "\nRequired materials: " + activityOne.getRequiredMaterials());

        Activity activityTwo = new Activity();
        System.out.println("--------------------------------");
        activityTwo.setActivityName("training");
        activityTwo.setRequiredMaterials("leash, food, water");
        System.out.println("Activity name: " + activityTwo.getActivityName() + "\nRequired materials: " + activityTwo.getRequiredMaterials());
    }
}
