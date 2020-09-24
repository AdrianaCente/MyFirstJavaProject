public class Lab5 {
    public static void main(String[] args) {
        LogicalOperations operation = new LogicalOperations();

//        Array homework

//        1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele
//        conform principiului polimorfismului. Creati cel putin cate doua metode polimorfe
//        pentru fiecare metoda pe care o aveti in clasa.

//        !!!!! We haven't learn yet about polymorphism in java !!!!!

//        2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
//        valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
//        Apelati metoda in main() pentru a verifica daca functioneaza.
        int[] returnedArray = operation.getArrayToNumber(100);
        System.out.print("Print values from 1 to 100: ");
        operation.printArray(returnedArray);
        System.out.println();

//        3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
//        si sa il returneze populat cu toate valorile pare de la 1 la 100.
//        Apelati metoda in main() pentru a verifica daca functioneaza.
//        Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
        int[] receivedArray = new int[50];
        System.out.print("Print even values from 1 to 100: ");
        operation.printArray(operation.evenArray(receivedArray));
        System.out.println();

//        4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
//        Metoda sa calculeze si sa returneze media numerelor din array.
//        Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println("The average in this array is: " + operation.computeAverage(new int[]{2, 3, 4, 5, 6,7}));

//        5. Creati o metoda care sa primeasca un parametru de tip array de string-uri,
//        populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit
//        se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
//        Apelati metoda in main() pentru a verifica daca functioneaza.
        String[] sentArray = new String[]{"Ana", "are", "mere", "si", "pere"};
        System.out.println("Is the value in the array: " + operation.isValueInArray(sentArray, "ana"));

//        6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
//        de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa
//        returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.
        int[] sentArrayOfNumbers = new int[]{2, 8, 9, 1, 77, 6, 44};
        String result = (operation.isNumberInArray(sentArrayOfNumbers, 44) == -1) ? "The number is not in the array." : String.format("The number " +
                "is in the array at position %s.", operation.isNumberInArray(sentArrayOfNumbers, 44));
        System.out.println(result);

//        7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
        System.out.println("Print pattern: ");
        operation.printLinePattern(10);

//        8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
//        Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
//        Apelati metoda in main() pentru a verifica daca functioneaza.
        int[] initialArrayOfNumbers = new int[] {1, 2, 8, 9, 77, 41, 7, 53, 7};
        System.out.print("The array without the specified value is: ");
        operation.printArray(operation.arrayWithoutReceivedValue(initialArrayOfNumbers, 8));
        System.out.println();

//        9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
//        Apelati metoda in main() pentru a verifica daca functioneaza.
        int[] sentNumberArray = new int[]{20, 89, 77, 39, 48, 45, 61, 1, 33};
        System.out.println("The second min in the array is: " + operation.secondMinInArray(sentNumberArray));
        //second method
        System.out.println("The second min in the array is: " + operation.secondMinInArraySecond(sentNumberArray));

//    10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori,
//    si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
//    Apelati metoda in main() pentru a verifica daca functioneaza.
        int[] sentArrayNumbers = new int[]{7, 26, 33, 1, 79, 5, 3, 1, 56};
        int[] receivedArrayOfNumbers = new int[sentArrayNumbers.length];
        System.out.print("The copied array is: ");
        operation.printArray(operation.copiedArray(sentArrayNumbers, receivedArrayOfNumbers));
        System.out.println();

//    Array optional homework

//    1. Creati o metoda care sa returneze al doilea cel mai mic numar dintr-un array.
//    !!!!! The exercise is solved at number 9.!!!!!

//    2. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
        int[] sentArrayNumbersTwo = new int[]{7, 26, 33, 1, 79, 5, 3, 1, 156};
        System.out.print("The array with the inserted value is: ");
        operation.printArray(operation.insertElementInArray(sentArrayNumbersTwo, 1, 100));
        System.out.println();

//    3. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
        int[] minMaxArray = new int[]{7, 26, 33, 1, 79, 5, 3, 1, 56};
        operation.findMaxMinArray(minMaxArray);

//        4. Creati o metoda care sa inverseze valorile unui array de int-uri.
        int[] sentArrayRevers = new int[]{7, 26, 33, 1, 79, 5, 3, 1, 56};
        System.out.print("The reversed array is: ");
        operation.printArray(operation.reverseArray(sentArrayRevers));
        System.out.println();
//        second method
        int[] sentArrayReversTwo = new int[]{75, 22, 3, 78, 5, 6, 1, 3, 74, 3};
        System.out.print("The reversed array is: ");
        operation.printArray(operation.reverseArrayTwo(sentArrayReversTwo));
        System.out.println();

//      5. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
        int[] duplicateArray = new int[]{75, 22, 3, 75, 5, 6, 1, 3, 74, 99};
        System.out.println("The duplicate elements are: ");
        operation.findDuplicateValues(duplicateArray);

//       6. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).
        String[] firstArray = new String[] {"Ana", "are", "mere", "si", "pere"};
        String[] secondArray = new String[] {"Maria", "are", "caise", "sau", "pere"};
        System.out.println("The common elements are: ");
        operation.findCommonElementsInArrays(firstArray, secondArray);
        System.out.println();

//       7. Creati o metoda care sa primeasca un array de numere ne-ordonat,
//        si sa il returneze ordonat crescator.
        int[] sentNumbersArray = new int[]{100, 3, 5, 20, 89, 77, 39, 48, 45, 61, 1, 33};
        System.out.print("The sorted array: ");
        operation.printArray(operation.sortArray(sentNumbersArray));
        System.out.println();
    }
}
