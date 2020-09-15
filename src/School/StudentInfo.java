package School;

public class StudentInfo extends Student {
    StudentInfo() {
        super(23, "Ana", "Stan");
    }
    public void show () {
        System.out.println(String.format("%s %s with the ID %d, is a student at Informatics.", getName(), getSurname(), getId()));
    }
}
