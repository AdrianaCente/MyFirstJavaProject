package ConsoleLine;

import Laboratory.Calculator;
import Laboratory.LogicalOperations;
import Laboratory.ReadFromKeyboard;

import java.lang.reflect.Method;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadFromKeyboard readKeyboard = new ReadFromKeyboard();
        LogicalOperations logic = new LogicalOperations();
        Calculator calculus = new Calculator();
        Options menuList = new Options();
        String name = "Ana";
        String pass = "pass";
        int countLogin = 0;

        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu(0, "Exit", ""));
        menu.add(new Menu(1, "Add two numbers", "calculus.sumTwoNumbers(5, 6)"));
        menu.add(new Menu(2, "Add four numbers", "calculus.sumFourNumbers(5, 6, 2, 9)"));
        menu.add(new Menu(3, "Subtract", "calculus.subtract(10, 3.3f)"));
        menu.add(new Menu(4, "Multiply two numbers", "calculus.multiply(5.5f, 3.3f)"));
        menu.add(new Menu(5, "Divide two numbers", "calculus.divide(25.5, 3.3)"));

        if (menuList.loginInApplication(name, pass) == true && countLogin <= 3) {
            System.out.println();
            menuList.displayMenu(menu);

            int option = readKeyboard.getOptionMenu(menu);
            if (option == 0)
                System.exit(option);

            while (option != 0) {
//            for (var i = 0; i < menu.size(); i++) {
//                if (menu.get(i).id == option) {
//                    System.out.println(menu.get(i).methodName);
//                }
//            }
                switch (option) {
                    case 1:
                        System.out.println("The sum of two numbers is " + calculus.sumTwoNumbers(5, 6));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("The sum for the four numbers is " + calculus.sumFourNumbers(5, 6, 2, 9));
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("The subtraction's result is " + calculus.subtract(10, 3.3f));
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("The multiplication's result is " + calculus.multiply(5.5f, 3.3f));
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("The division's result is " + calculus.divide(25.5, 3.3));
                        System.out.println();
                        break;
                }
                menuList.displayMenu(menu);
                option = readKeyboard.getOptionMenu(menu);
            }
        }
        System.out.println();
        System.out.println("The username or/ and the password is/ are incorrect. Please try again.");
        menuList.loginInApplication(name, pass);
        countLogin++;
    }
}
