package AnimalRescuer;

public abstract class MedicalPersonnel extends Human{
    private String specialization;
    private String job;

    public abstract void applyTreatment();

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
