import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {
        LogicalOperations operations = new LogicalOperations();

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(0);
        myList.add(1);
        myList.add(12);
        myList.add(14);
        myList.add(15);
        myList.add(16);
        myList.set(0, 10);
//        System.out.println(myList);

        myList.add(1, 20);
        myList.remove(2);
//        System.out.println(myList);

        // Lists homework

//      1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
        List<Integer> shortList = new ArrayList<>();
        shortList.add(5);
        shortList.add(7);
        shortList.add(12);
        shortList.add(90);
        shortList.add(78);
        System.out.println("The list is: ");
        operations.displayShortList(shortList);

//      2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
//      si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(2);
        firstList.add(77);
        firstList.add(9);
        firstList.add(23);
        firstList.add(4);
        System.out.println("Initial list: " +firstList);
        System.out.println("The list after added element: " + operations.addElementList(firstList, 44));

//      3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
//      iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
//      fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
        List<Integer> secondList = new ArrayList<Integer>();
        secondList.add(2);
        secondList.add(56);
        secondList.add(7);
        secondList.add(11);
        secondList.add(2);
        secondList.add(10);
        secondList.add(77);
        System.out.println("The list is:");
        operations.displayListElements(secondList, 7);

//      4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
//      toate valorile din lista, dar invers(de la capat la inceput).
        List<Integer> thirdList = new ArrayList<Integer>();
        thirdList.add(2);
        thirdList.add(9);
        thirdList.add(12);
        thirdList.add(24);
        thirdList.add(77);
        thirdList.add(90);
        System.out.println("The reversed list is: ");
        operations.displayReversedList(thirdList);

//     5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
//     unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
//     iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
        List<String> fourthList = new ArrayList<String>();
        fourthList.add("aa");
        fourthList.add("bb");
        fourthList.add("cc");
        fourthList.add("dd");
        fourthList.add("ee");
        System.out.println("The list with the inserted value:" + operations.addElementAtPosition(fourthList, 1, "inserted value"));

//      6. Scrieti o metoda Java, care sa primeasca doi parametrii.
//      Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa
//      il adauge pe prima pozitie din lista.
        List<Integer> fifthList = new ArrayList<>();
        fifthList.add(3);
        fifthList.add(6);
        fifthList.add(8);
        fifthList.add(1);
        fifthList.add(33);
        System.out.println("The list with the first element added is: "  +operations.addElementOnFirstPosition(fifthList, 100));

//     7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
//     si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(4);
        newList.add(6);
        newList.add(9);
        newList.add(10);
        newList.add(14);
        operations.displayDetailedList(newList);

//      8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
        List<Integer> anotherList = new ArrayList<Integer>();
        anotherList.add(4);
        anotherList.add(67);
        anotherList.add(12);
        anotherList.add(34);
        anotherList.add(9);
        System.out.println("The bigger number is: " + operations.findMaxNumberInList(anotherList));

//        Optional homework

//      1. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista.
        List<Integer> sentListSwitch = new ArrayList<>();
        sentListSwitch.add(22);
        sentListSwitch.add(10);
        sentListSwitch.add(33);
        sentListSwitch.add(44);
        sentListSwitch.add(90);
        sentListSwitch.add(77);
        System.out.println("The list with the switched elements is: " + operations.switchElementsInList(sentListSwitch, 10, 90));

//      2. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, care sa contina doar numerele pare din lista primita.
        List<Integer> sentList = new ArrayList<Integer>();
        sentList.add(3);
        sentList.add(6);
        sentList.add(9);
        sentList.add(8);
        sentList.add(10);
        System.out.println("The list with even elements: " + operations.getEvenListElements(sentList));

//      3. Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.
//      Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi), si nu folosit librarie externa,
//      precum Collection.sort().
        List<Integer> sentUnsortedList = new ArrayList<Integer>();
        sentUnsortedList.add(8);
        sentUnsortedList.add(2);
        sentUnsortedList.add(12);
        sentUnsortedList.add(1);
        sentUnsortedList.add(3);
        sentUnsortedList.add(15);
        System.out.println("The ascending sorted list is: " + operations.sortListAscending(sentUnsortedList));
    }
}
