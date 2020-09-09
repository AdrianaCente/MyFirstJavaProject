package AnimalRescuer;

public class Veterinarian {
    private String name;
    private String specialization;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void applyTreatment() {
        System.out.println("The doctor applies treatments to patients in the " + specialization + " department.");
    }

    public void writePrescriptions() {
        System.out.println("Doctor " + name + " writes prescription for the required treatment.");
    }
}
