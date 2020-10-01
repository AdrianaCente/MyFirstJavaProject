package ConsoleLineProgram;

import Laboratory.Calculator;
import Laboratory.LogicalOperations;
import Laboratory.ReadFromKeyboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Program {
    public ReadFromKeyboard readKeyboard = new ReadFromKeyboard();
    public LogicalOperations logic = new LogicalOperations();
    public Calculator calculus = new Calculator();
    public int countLogin;

    public void startProgram() {
        boolean isExecuting;
        HashMap<String, String> usersList = createUsersList();
        if (loginInApplication(usersList)) {
            do {
                isExecuting = executeProgram();
            } while (isExecuting);
        }
    }

    public boolean executeProgram() {
        List<Menu> menuCalculator = createCalculatorMenuList();
        List<Menu> menuLogical = createLogicMenuList();
        List<Menu> mainMenu = createMainMenu();
        System.out.println();
        System.out.println("Your options are:");
        displayMenu(mainMenu);
        int mainOption = readKeyboard.getOptionMenu(mainMenu);
        switch (mainOption) {
            case 0:
                System.out.println("Program ended.");
                return false;
            case 1:
                boolean isCalculator;
                do {
                    isCalculator = executeCalculatorSubmenu(menuCalculator);
                } while (isCalculator);
                break;
            case 2:
                boolean isLogical;
                do {
                    isLogical = executeLogicSubmenu(menuLogical);
                } while (isLogical);
                break;
        }
        return true;
    }

    public boolean executeCalculatorSubmenu(List<Menu> menuCalculator) {
        System.out.println();
        System.out.println("*** Calculator submenu ***");
        displayMenu(menuCalculator);
        int option = readKeyboard.getOptionMenu(menuCalculator);
//        for (var i = 0; i < menuCalculator.size(); i++) {
//                if (menuCalculator.get(i).id == option) {
//                    System.out.println(menuCalculator.get(i).methodName);
//                }
//            }
        switch (option) {
            case 0:
                System.out.println("Return to main menu.");
                return false;
            case 1:
                System.out.println("The sum of the two numbers is " + calculus.sumTwoNumbers() + ".");
                System.out.println();
                break;
            case 2:
                System.out.println("The sum for the four numbers is " + calculus.sumFourNumbers() + ".");
                System.out.println();
                break;
            case 3:
                System.out.println("The subtraction's result is " + calculus.subtract() + ".");
                System.out.println();
                break;
            case 4:
                System.out.println("The multiplication's result is " + calculus.multiply() + ".");
                System.out.println();
                break;
            case 5:
                System.out.println("The division's result is " + calculus.divide() + ".");
                System.out.println();
                break;
            case 6:
                System.out.println("The reminder is " + calculus.modulo() + ".");
                System.out.println();
                break;
            default:
                System.out.println("Your options are:");
                displayMenu(menuCalculator);
        }
        return true;
    }

    public boolean executeLogicSubmenu(List<Menu> menuLogical) {
        System.out.println();
        System.out.println("*** Logic submenu ***");
        displayMenu(menuLogical);
        int optionLogic = readKeyboard.getOptionMenu(menuLogical);
        switch (optionLogic) {
            case 0:
                System.out.println("Return to main menu.");
                return false;
            case 1:
                System.out.println("The bigger number is " + logic.checkBiggerNumber() + ".");
                System.out.println();
                break;
            case 2:
                System.out.println(logic.compareStrings());
                System.out.println();
                break;
            case 3:
                System.out.println(logic.weatherForecast());
                System.out.println();
                break;
            case 4:
                System.out.println(logic.checkNumber());
                System.out.println();
                break;
            case 5:
                logic.pressedKeyWithoutConcatenation();
                System.out.println();
                break;
            case 6:
                System.out.println("Is the number even? " + logic.isNumberEven());
                System.out.println();
                break;
            case 7:
                System.out.println("Is eligible to vote? " + logic.isEligibleToVote());
                System.out.println();
                break;
            case 8:
                System.out.println("The max number is: " + logic.checkMaxNumber());
                System.out.println();
                break;
            default:
                System.out.println("Your options are:");
                displayMenu(menuLogical);
        }
        return true;
    }

    public List<Menu> createCalculatorMenuList() {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu(0, "Return to main menu", ""));
        menu.add(new Menu(1, "Add two numbers", "sumTwoNumbers"));
        menu.add(new Menu(2, "Add four numbers", "sumFourNumbers"));
        menu.add(new Menu(3, "Subtract two numbers", "subtract"));
        menu.add(new Menu(4, "Multiply two numbers", "multiply"));
        menu.add(new Menu(5, "Divide two numbers", "divide"));
        menu.add(new Menu(6, "The reminder of two numbers", "modulo"));

        return menu;
    }

    public List<Menu> createLogicMenuList() {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu(0, "Return to main menu"));
        menu.add(new Menu(1, "Find the bigger number", "checkBiggerNumber"));
        menu.add(new Menu(2, "Compare string with 'FastTrackIT'", "compareStrings"));
        menu.add(new Menu(3, "What's the weather", "weatherForecast"));
        menu.add(new Menu(4, "Compare number", "checkNumber"));
        menu.add(new Menu(5, "Press a number", "pressedKeyWithoutConcatenation"));
        menu.add(new Menu(6, "Check for even values", "isNumberEven"));
        menu.add(new Menu(7, "Check vote eligibility", "isEligibleToVote"));
        menu.add(new Menu(8, "Find max value", "checkMaxNumber"));

        return menu;
    }

    public List<Menu> createMainMenu() {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu(0, "Exit"));
        menu.add(new Menu(1, "Calculator"));
        menu.add(new Menu(2, "Logic"));
        return menu;
    }

    public void displayMenu(List<Menu> menu) {
        for (Menu element : menu) {
            element.showMenu();
        }
        System.out.println();
    }

    public HashMap<String, String> createUsersList() {
        HashMap<String, String> usersList = new HashMap<String, String>();
        usersList.put("Ana", "pass");
        usersList.put("Dan", "ddd");
        usersList.put("Ene", "eva");
        usersList.put("Denise", "123");
        return usersList;
    }

    public boolean loginInApplication(HashMap<String, String> usersList) {
        while (countLogin < 3) {
            Scanner scanValue = new Scanner(System.in);
            System.out.print("Please enter your username: ");
            String user = scanValue.nextLine();
            Scanner scanPassTwo = new Scanner(System.in);
            System.out.print("Please enter your password: ");
            String pass = scanPassTwo.nextLine();
            for (String i : usersList.keySet()) {
                if (user.equals(i) && pass.equals(usersList.get(i))) {
                    return true;
                }
            }
            countLogin++;
            System.out.println("The username/ password is/ are incorrect. Please try again.");
        }
        System.out.println("You entered the incorrect credentials as many times as possible.");
        return false;
    }
}
