package AnimalRescuer;

public class CatActivity extends Activity {
    public void planActivityDetails() {
        System.out.println("Activity: " + getActivityName() + ", requires this materials: " + getRequiredMaterials() + ". For cats we should take some extra toys.");
    }
}
