package School;

public class StudentEngl extends Student{
    public String disciplines;
    public int id;

    StudentEngl() {
        this(100, "Emma", "Watson", "Math");
    }

    StudentEngl(int id, String name, String surname, String disciplines) {
        super(id+10, name, surname);
        this.id = id;
        this.disciplines = disciplines;
    }

    public String getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String disciplines) {
        this.disciplines = disciplines;
    }

    public void show () {
        System.out.println(String.format("%s %s with the ID %d, is a student at English. She studies %s.", getName(), getSurname(), getId(), getDisciplines()));
        System.out.println("Base is: " + id);
        System.out.println("Super id: " + super.getId());
    }
}
