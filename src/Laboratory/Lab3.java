package Laboratory;

public class Lab3 {
    public static void main(String[] args) {

//      Exercises from class
        LogicalOperations logic = new LogicalOperations();

//      Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
        System.out.println("Comparison's result is: " + logic.checkComparison(1));

//      If the user pressed number keys( from 0 to 9), the program will tell the number that is
//      pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
        logic.pressedKey(6);


//      Write a Java program to determine whether an input number is an even number
        logic.checkEvenNumber(11);

//      Write Java program to allow the user to input his/her age. Then the program will show
//      if the person is eligible to vote. A person who is eligible to vote must be older than or
//      equal to 18 years old
        logic.checkAge(12);
    }
}
