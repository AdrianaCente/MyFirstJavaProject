package School;

import java.util.Scanner;

public class SchoolMain {
    public static void main (String[] args) {
        Student student1 = new Student (42, "Decebal", "Popescu");
        /*
            noi dorim sa facem o copie a obiectului student1, numita student2
            apoi sa modificam copia respectiva
        */
        Student student2 = new Student(student1);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String firstName = scan.nextLine();
        System.out.println("The value you entered is: " + firstName);
        student2.setName(firstName);
        student2.setSurname("Ghiu");

        /*
            trebuie sa afiseze
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        */
        student1.show();

        /*
            trebuie sa afiseze
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();

        MathOperations operationOne = new MathOperations();
        System.out.println(operationOne.mathCalculus());
        System.out.println(operationOne.formatNumbers());
    }
}
