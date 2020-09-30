package AnimalRescuer;

public abstract class Activity {
    private String activityName;
    private String requiredMaterials;

    public abstract void planActivityDetails();

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
}
