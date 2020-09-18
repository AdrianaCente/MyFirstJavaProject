public class Lab4 {
    public static void main(String[] args) {
        LogicalOperations operation = new LogicalOperations();

        // For loops homework
//        1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
//        Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
//        pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
//        deoarece metoda afiseaza, nu returneaza.
        System.out.print("Print numbers until 100: ");
        operation.printNumbersToPositive(45);
        System.out.println();

//        2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
//        Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
//        pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
//        deoarece metoda afiseaza, nu returneaza.
        System.out.print("Print numbers until -100: ");
        operation.printNumbersToNegative(-120);
        System.out.println();

//        3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
//        Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul
//        parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y
//        este cel de-al doilea, numaratoarea sa se faca de la x, la y.
        System.out.print("Print values between x and z: ");
        operation.printValuesBetweenWithFor(10, 45);
        System.out.println();

//        4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
//        Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare
//        crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este
//        cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
        System.out.print("Print values between x and z after checking the greatest: ");
        operation.printCheckedValuesBetweenWithFor(62, 40);
        System.out.println();

//        5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
        System.out.print("Print even numbers between 1 and 100: ");
        operation.printEvenNumbers();
        System.out.println();

//        6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        System.out.print("Print uneven numbers between 1 and 100: ");
        operation.printUnevenNumbers();
        System.out.println();

//        7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
//        Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
//        iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a
//        verifica daca functioneaza.
        System.out.println("The sum of the numbers between x and 100: " + operation.printSum(60));

//        8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
//        Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
//        si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
//        metoda main() pentru a verifica daca functioneaza.
        System.out.println("The average of the numbers between x and 100: " + operation.printAverage(60));

//        9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
        operation.printPattern();

        // While loops homework



//        9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
        operation.printFibonacci();
        System.out.println();

//        10. Creati o metoda numita CozaLozaWoza.
        System.out.println("CozaLozaWoza: ");
        operation.CozaLozaWoza();

        // From class
//        operation.printSumAndAverage(1, 100);
//        operation.printValuesBetween(50, 34);
    }
}
