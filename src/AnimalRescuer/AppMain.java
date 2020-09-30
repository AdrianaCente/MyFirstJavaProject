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
        dogOne.setHunger(6);
        dogOne.setGender("female");
        dogOne.setBreed("beagle");
        dogOne.setStateOfMind(9);
        dogOne.setPersonalDoctor("Dolittle");
        System.out.println("\n--------------------------------\nDog's details:" +
                "\n--------------------------------\n");
        System.out.println("Name: " + dogOne.getName() + "\n" +
                "Age: " + dogOne.getAge() + "\nGender: " + dogOne.getGender() + "\nFavourite food: " + dogOne.getFavouriteFood() + "\n" +
                "Favourite activity: " + dogOne.getFavouriteActivity() + "\nFavourite doctor: " + dogOne.getPersonalDoctor());
        dogOne.eat();
        dogOne.activity();
        dogOne.bark();
        dogOne.animalSound();
        System.out.println(dogOne.isHungry());
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
        dogTwo.setGender("male");
        dogTwo.setHunger(10);
        dogTwo.setStateOfMind(9);
        dogTwo.setPersonalDoctor("Strange");
        System.out.println("--------------------------------");
        System.out.println("Name: " + dogTwo.getName() + "\n" +
                "Age: " + dogTwo.getAge() + "\nGender: " + dogOne.getGender() + "\nFavourite food: " + dogTwo.getFavouriteFood() + "\n" +
                "Favourite activity: " + dogTwo.getFavouriteActivity() + "\nFavourite doctor: " + dogTwo.getPersonalDoctor());
        dogTwo.run();
        dogTwo.activity();
        dogTwo.sleep();
        dogTwo.eat();
        dogTwo.animalSound();
        System.out.println(dogTwo.isHungry());
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
        catOne.animalSound();
        catOne.sleep();
        System.out.println(catOne.getName() + " is a " + catOne.getColor() + " cat. He is " + catOne.getAge() + " years old and has been " +
                "brought to the shelter 2 months ago. \nHe enjoys " + catOne.getFavouriteActivity() + " and his favourite food" +
                " is " + catOne.getFavouriteFood() + ". The doctor that takes care of his health is " + catOne.getPersonalDoctor() + ".");

        // Adopter
        GirlAdopter girlOne = new GirlAdopter();
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

        BoyAdopter boyOne = new BoyAdopter();
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
        docOne.setJob("Doctor");
        System.out.println("Name: " + docOne.getName() + "\nSpecialization: " + docOne.getSpecialization());
        docOne.applyTreatment();
        docOne.writePrescriptions();
        System.out.println(docOne.getJob() + " " + docOne.getName() + " is specialty trained to advance the " + docOne.getSpecialization() +" of animals through " +
                "clinical practice, research, and science-based behavior education.");

        Veterinarian docTwo = new Veterinarian();
        System.out.println("--------------------------------");
        docTwo.setName("Strange");
        docTwo.setSpecialization("dentistry");
        docTwo.setJob("Doctor");
        System.out.println("Name: " + docTwo.getName() + "\nSpecialization: " + docTwo.getSpecialization());
        docTwo.applyTreatment();
        docTwo.writePrescriptions();
        System.out.println(docTwo.getJob() + " " + docTwo.getName() + " is specialty trained to advance the " + docTwo.getSpecialization() + " of animals through " +
                "cleaning, adjustment, filing, extraction, or repair of animals' teeth and all other aspects of oral health care in animals.");

//        Nurse
        Nurse nurseOne = new Nurse();
        System.out.println("\n--------------------------------\nNurse's details:" +
                "\n--------------------------------\n");
        nurseOne.setName("Emma");
        nurseOne.setSpecialization("behaviour");
        nurseOne.setJob("Nurse");
        System.out.println("Name: " + nurseOne.getName() + "\nSpecialization: " + nurseOne.getSpecialization());
        nurseOne.applyTreatment();

        // Dog food and Cat food
        DogFood dogFoodOne = new DogFood();
        dogFoodOne.setFoodName("Biscuits");
        dogFoodOne.setFoodDescription("crunchy");
        dogFoodOne.setPrice(5.5);
        dogFoodOne.setQuantity(10);
        dogFoodOne.setAvailability(true);
        dogFoodOne.setRecommendedQuantity(120);
        System.out.println("\n--------------------------------\nFood's details:" +
                "\n--------------------------------\n");
        System.out.println("Dog food \nFood name: " + dogFoodOne.getFoodName() + "\n" +
                "Food description: " + dogFoodOne.getFoodDescription() + "\nPrice: " + dogFoodOne.getPrice() + "\n" +
                "Food quantity: " + dogFoodOne.getQuantity() + "\nRecommended quantity for a regular dog: " + dogFoodOne.getRecommendedQuantity());
        dogFoodOne.setQuantity(0);
        dogFoodOne.setAvailability(false);
        dogFoodOne.recommendFoodQuantityAndType();
        System.out.println("Is "+ dogFoodOne.getFoodName() + " in stock: " + dogFoodOne.getAvailability());

        CatFood catFoodTwo = new CatFood();
        System.out.println("--------------------------------");
        catFoodTwo.setFoodName("Beef can");
        catFoodTwo.setFoodDescription("Some details about beef can content.");
        catFoodTwo.setPrice(20);
        catFoodTwo.setQuantity(100);
        catFoodTwo.setAvailability(true);
        catFoodTwo.setRecommendedForCats(true);
        System.out.println("Cat food \nFood name: " + catFoodTwo.getFoodName() + "\n" +
                "Food description: " + catFoodTwo.getFoodDescription() + "\nPrice: " + catFoodTwo.getPrice() + "\n" +
                "Food quantity: " + catFoodTwo.getQuantity());
        catFoodTwo.recommendFoodQuantityAndType();

        // Dog's activity and cat's activity
        CatActivity activityOne = new CatActivity();
        activityOne.setActivityName("walk in the park");
        activityOne.setRequiredMaterials("toy, water");
        System.out.println("\n--------------------------------\n" +
                "Activity conducted with a pet:\n--------------------------------\n");
        System.out.println("Cat's activity \nActivity name: " + activityOne.getActivityName() + "\nRequired materials: " + activityOne.getRequiredMaterials());
        activityOne.planActivityDetails();

        DogActivity activityTwo = new DogActivity();
        System.out.println("--------------------------------");
        activityTwo.setActivityName("training");
        activityTwo.setRequiredMaterials("food, water");
        activityTwo.setLeashRequired(true);
        System.out.println("Dog's activity \nActivity name: " + activityTwo.getActivityName() + "\nRequired materials: " + activityTwo.getRequiredMaterials() +
                "\nLeash required: " + activityTwo.isLeashRequired());
        activityTwo.planActivityDetails();
    }
}
