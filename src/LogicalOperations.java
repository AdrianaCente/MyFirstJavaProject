public class LogicalOperations {

    public int checkComparison(int number) {
        if (number >=2 && number <= 8) {
            return number;
        }
        return 0;
    }

    public String weatherForecast(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        }
        return "The forecast snow is(cm): " + number;
    }
    public String checkNumber(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        }
        return "No case of the above";
    }

    public void pressedKey(int number) {
        switch (number) {
            case 0:
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println(number); break;
            default: System.out.println("Not allowed");
        }
    }

    public void checkEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else System.out.println("It's not an even number.");
    }

    public void checkAge(int age) {
        if (age >= 18) {
            System.out.println("The person can vote.");
        } else System.out.println("The person is minor, cannot vote.");
    }
}
