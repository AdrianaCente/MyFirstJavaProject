package AnimalRescuer;

public class Veterinarian extends MedicalPersonnel{
    public void applyTreatment() {
        System.out.println("The doctor decides and sometimes applies treatments to patients in the " + getSpecialization() + " department.");
    }

    public void writePrescriptions() {
        System.out.println("Doctor " + getName() + " writes prescription for the required treatment.");
    }
}
