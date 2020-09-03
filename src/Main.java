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
    }
}
