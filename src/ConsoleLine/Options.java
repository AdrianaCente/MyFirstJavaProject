package ConsoleLine;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Options {
    public void displayMenu(List<Menu> menu) {
        for (Menu element : menu) {
            element.showMenu();
        }
        System.out.println();
    }

    public boolean loginInApplication(String userName, String password) {
        Scanner scanValue = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String user = scanValue.nextLine();
        Scanner scanPassTwo = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String pass = scanPassTwo.nextLine();
        if (user.equals(userName) && pass.equals(password)) {
            return true;
        }
        return false;
    }

    public int getOptionMenu(List<Menu> menu) {
        int returnedValue = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                Scanner scanValue = new Scanner(System.in);
                System.out.print("Please enter an option: ");
                returnedValue = scanValue.nextInt();
                if (returnedValue >= menu.size()) {
                    System.out.printf("Index is out of range. Please enter a number lower than %d.", menu.size());
                    continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid type entered. Please enter a number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("Index is out of range. Please enter a number between 1 and %d", menu.size());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return returnedValue;
    }
}
