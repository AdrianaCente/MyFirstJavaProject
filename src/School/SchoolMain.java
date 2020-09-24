package School;

import java.util.*;

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

        Student student3 = new Student(10, "Emma", "Down");
        student3.show();
        Student student4 = new StudentInfo();
        student4.show();
        Student student5 = new StudentEngl(77, "Hanna", "Bom", "Literature");
        student5.show();
        System.out.println(student5.getClassId());
        Vector<Integer> vec = new Vector<Integer>(5);
        vec.add(2);
        vec.add(3);
        vec.add(5);
        vec.add(7);
        vec.add(9);
        vec.add(1, 77);
        vec.set(0, 22);
        System.out.printf("The vector is %s and has the size %s.", vec, vec.size());
        System.out.println();
        for (int element : vec) {
            System.out.println(element);
        }
        System.out.println("Iterate with for: ");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.get(i) + " ");
        }

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
//            linkedList.remove(0);
        }
        System.out.println();
        for (int element : linkedList) {
            System.out.println(element);
        }
        ListIterator<Integer> iterOne = linkedList.listIterator();
        System.out.println("Iterate on linked list:");
        while (iterOne.hasNext()) {
            System.out.println(iterOne.next());
            iterOne.remove();
        }
        System.out.println(linkedList.isEmpty());

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(3);
        arrList.add(5);
        arrList.add(7);
        arrList.add(9);
        ListIterator<Integer> iter = arrList.listIterator();
    }
}
