package AnimalRescuer;

public class Veterinarian {
    String name = "John Doe";
    String specialization = "behaviour";
    public void applyTreatment() {
        System.out.println("The doctor applies treatments to patients in the " + specialization + " department.");
    }
    public void writePrescriptions() {
        System.out.println("Doctor " + name + " writes prescription for the required treatment.");
    }
}
