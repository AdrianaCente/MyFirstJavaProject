package AnimalRescuer;

public class CatFood extends Food{
    private boolean isRecommendedForCats;

    public boolean isRecommendedForCats() {
        return isRecommendedForCats;
    }

    public void setRecommendedForCats(boolean recommendedForCats) {
        isRecommendedForCats = recommendedForCats;
    }
}
