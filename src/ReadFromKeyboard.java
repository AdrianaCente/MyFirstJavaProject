import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {
    public int getInt() {
        int number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a number(int): ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered.");
            }
        }
        return number;
    }

    public float getFloat() {
        float number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a number(float): ");
                number = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered.");
            }
        }
        return number;
    }

    public double getDouble() {
        double number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a number(double): ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered.");
            }
        }
        return number;
    }

    public long getLong() {
        long number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a number(long): ");
                number = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered.");
            }
        }
        return number;
    }

    public int[] getArrayOfNumbers(int value) {
        int[] createdArray = new int[value];
        int i = 0;
        while (i < value) {
            try {
                Scanner scanValue = new Scanner(System.in);
                System.out.print("Enter each value of the array: ");
                createdArray[i] = scanValue.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered. Please enter a number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return createdArray;
    }

    public List<Integer> getListOfNumbers() {
        int number = 0;
        List<Integer> resultedList = new ArrayList<>();
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a number to be added to the list: ");
                number = scan.nextInt();
                resultedList.add(number);
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered.");
                repeat = false;
            }
        }
        return resultedList;
    }

    public void getValueOfTheElement(int[] sentArray, int position) {
        try {
            System.out.println("The element from the specified position is " + sentArray[position] + ".");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Inside catch, number too large.");
        } catch (Exception e) {
            System.out.println("Error found." + e.getMessage());
        }
    }
}
