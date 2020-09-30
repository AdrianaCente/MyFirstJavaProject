package Laboratory;

public class Main {

    public static void main(String[] args) {
        //Exercise
        String firstName = "Ana";
        String lastName = "Red";
        int age = 30;
        String occupation = "student";
        float rentPrice = 250.5f;
        System.out.println(firstName + " " + lastName + " is " + age + " years old. " +
                "She is a " + occupation + " at the Technical University. " +
                "She pays a rent of " + rentPrice + "$.");

        int a = 10;
        int b = 23;
        a++; // 11
        b--; // 22
        System.out.println("a + b = " + (a + b));

        float x = 15.4f;
        double y = 555.2;
        float z = x / (float)y;
        System.out.println("z = " + z);
        double w = y / x;
        System.out.println("w = " + w);
        double remainderDouble = y % x;
        System.out.printf("remainderDouble = %f%n", remainderDouble);
        float remainderFloat = (float)y % x;
        System.out.println("remainderFloat = " + remainderFloat);
        x += 20; // x = 35.4
        y -=200; // y = 355.2
        System.out.printf("x * y = %1.2f\n", x * y);

        //Homework
        System.out.println("Hello \nAdriana!");

        int numberOne = 8;
        int numberTwo = 12;
        System.out.printf("The sum is %d%n", numberOne + numberTwo);

        int numberOneDiv = 153;
        int numberTwoDiv = 11;
        System.out.println("Division's result is " + (double)numberOneDiv / numberTwoDiv);
        System.out.printf("Division's result is %f\n", (float)numberOneDiv / numberTwoDiv);

        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("(55 + 9) % 9 = " + (55 + 9) % 9);
        System.out.println("20 + (-3) * 5 / 8 = " + (20 + -3 * 5 / 8d));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 2 * 15 / 3 - 8 % 3));


        // Homework if / else

        // 1. Calculator class
        Calculator calculatorOne = new Calculator();
        System.out.println("____________________ Homework if / else ____________________");
        System.out.println("The sum of  two numbers is " + calculatorOne.sumTwoNumbers());
        System.out.println("The sum for the four numbers is " + calculatorOne.sumFourNumbers());
        System.out.println("The subtraction's result is " + calculatorOne.subtract());
        System.out.println("The multiplication's result is " + calculatorOne.multiply());
        System.out.println("The division's result is " + calculatorOne.divide());
        System.out.println("The reminder is " + calculatorOne.modulo());
        calculatorOne.printExpressionOne();
        System.out.println("Expression two equals " + calculatorOne.computeExpressionTwo(55, 9, 9));
        System.out.println("Expression three equals " + calculatorOne.computeExpressionThree(20, -3, 5, 8));
        System.out.println("Expression four equals " + calculatorOne.computeExpressionFour());

        //  2. LogicalOperations class
        LogicalOperations logic = new LogicalOperations();

        //  3. Creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si parametrii.
        //  Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori
        //  care va vin ca si parametrii, si returnati numarul mai mare.
        System.out.println("The bigger number is: " + logic.checkBiggerNumber());

        //  4. Creati o metoda de tip String, care sa primeasca un parametru de tip String. Verificati daca textul ce
        //  vine ca si parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze “Learning text comparison”.
        //  Daca nu, atunci metoda sa returneze “Got to try some more”.
        System.out.println(logic.compareStrings());

        //  5. Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
        //  Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic
        //  sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este
        //  mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica
        //  daca functioneaza.
        System.out.println(logic.checkTextAndNumber("FastTrack",3));

        //  6. Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai
        //  mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul.
        //  Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica
        //  daca functioneaza.
        System.out.println(logic.weatherForecast());

        //  7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3,
        //  SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4,
        //  returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
        //  Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println(logic.checkNumber());

        //  8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. Folosind constructia
        //  Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte
        //  numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul
        //  de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
        //  Apelati metoda in main() pentru a verifica daca functioneaza.
        logic.pressedKeyWithoutConcatenation();

        //  9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
        //  si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
        //  Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println("Is an even number? " + logic.isNumberEven());

        //  10. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
        //  care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18,
        //  sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println("Is the person eligible to vote? " + logic.isEligibleToVote());

        //  11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
        //  Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println("The maximum value between three numbers is: " + logic.checkMaxNumber());
    }
}
