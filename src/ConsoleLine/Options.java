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
}
