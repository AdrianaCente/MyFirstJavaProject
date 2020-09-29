import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        ReadFromKeyboard readOne = new ReadFromKeyboard();
        LogicalOperations logic = new LogicalOperations();

//        From class

//        int[] arr = {1, 2, 3, 4, 5};
//        int number;
//        Scanner scan = new Scanner(System.in);
//        number = scan.nextInt();
//        try {
//            System.out.println(arr[number]);
//        } catch(ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Index is out of range. " + exception.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


//        Try catch homework

//        1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
        System.out.println("1. First problem");
        System.out.println("The number you entered is " + readOne.getInt() + ".");
        System.out.println();

//        2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
//        care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)
        System.out.println("2. Second problem");
        System.out.println("The number(float) you entered is " + readOne.getFloat() + ".");
        System.out.println("The number(double) you entered is " + readOne.getDouble() + ".");
        System.out.println("The number(long) you entered is " + readOne.getLong() + ".");
        System.out.println();

//        3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
//        Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
        System.out.println("3. Third problem");
        logic.printArray(readOne.getArrayOfNumbers(5));
        System.out.println();

//        4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
//        Metoda nu v-a primi parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
//        (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e
//        numar, sa se intrerupa citirea)
        System.out.println("4. Fourth problem");
        System.out.println("The resulted list is: " + readOne.getListOfNumbers());

//        5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
//        Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
//        iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul:
//        "Inside catch, number too large".
        int[] sentArray = new int[] {0, 5, 9 , 10, 89, 6};
        readOne.getValueOfTheElement(sentArray, 3);

//        6. In clasa LogicalOp, creati o metoda  'wait()'.
//        Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
//        In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca
//        valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.
        int timeWaiting = 5;
        logic.wait(timeWaiting);
        System.out.printf("Waited for %d seconds. Finished homework.", timeWaiting);
    }
}
