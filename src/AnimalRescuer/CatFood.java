package AnimalRescuer;

public class CatFood extends Food{
    private boolean isRecommendedForCats;

    public boolean isRecommendedForCats() {
        return isRecommendedForCats;
    }

    public void setRecommendedForCats(boolean recommendedForCats) {
        isRecommendedForCats = recommendedForCats;
    }

    public void recommendFoodQuantityAndType() {
        System.out.println("Cats shouldn't eat food that is not recommended for them. They should also be given a certain amount of food.");;
    }
}
