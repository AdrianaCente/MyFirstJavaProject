package AnimalRescuer;

public class DogActivity extends Activity {
    private boolean isLeashRequired;

    public boolean isLeashRequired() {
        return isLeashRequired;
    }

    public void setLeashRequired(boolean leashRequired) {
        isLeashRequired = leashRequired;
    }

    public void planActivityDetails() {
        System.out.println("Activity: " + getActivityName() + ", requires this materials: " + getRequiredMaterials() + ". Leash required: " + isLeashRequired() + ".");
    }
}
