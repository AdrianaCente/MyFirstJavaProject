public class Lab3 {
    public static void main(String[] args) {

//        Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the
//        number
        LogicalOperations logic = new LogicalOperations();
        System.out.println(logic.checkComparison(1));

//        Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
//        this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
        System.out.println(logic.weatherForecast(3));

//        Given a number input, if the number is greater than 3 but not equal to 4, print “The
//        number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print
//        ”The number is equal to 4”. Else if the number is lower than 3 print “The number is
//        lower than 3”
        System.out.println(logic.checkNumber(1));

//        If the user pressed number keys( from 0 to 9), the program will tell the number that is
//        pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
        logic.pressedKey(6);

//        Write a Java program to determine whether an input number is an even number
        logic.checkEvenNumber(11);

//        Write Java program to allow the user to input his/her age. Then the program will show
//        if the person is eligible to vote. A person who is eligible to vote must be older than or
//        equal to 18 years old
        logic.checkAge(12);
    }
}
