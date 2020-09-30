package AnimalRescuer;

public class Nurse extends MedicalPersonnel{
    public void applyTreatment() {
        System.out.println("The nurse applies treatments to patients, at doctor's recommendation, in the " + getSpecialization() + " department.");
    }
}
