package AnimalRescuer;

public class Activity {
    private String activityName;
    private String requiredMaterials;

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getRequiredMaterials() {
        return this.requiredMaterials;
    }

    public void setRequiredMaterials(String requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }
    public void planActivityDetails() {
        System.out.println("Activity: " + activityName + ", requires this materials: " + requiredMaterials + ".");
    }
}
