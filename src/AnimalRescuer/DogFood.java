package AnimalRescuer;

public class DogFood extends Food{
    private float recommendedQuantity;

    public float getRecommendedQuantity() {
        return recommendedQuantity;
    }

    public void setRecommendedQuantity(float recommendedQuantity) {
        this.recommendedQuantity = recommendedQuantity;
    }
    public void recommendFoodQuantityAndType() {
        System.out.println("Dogs shouldn't eat more than " + recommendedQuantity + " of some food.");;
    }
}
