import com.sun.source.tree.WhileLoopTree;

public class LogicalOperations {

    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if ( firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public String compareStrings(String stringText) {
        if (stringText.equals("FastTrackIT")) {
            return "Learning text comparison.";
        } else {
            return "Got to try some more.";
        }
    }

    public String checkTextAndNumber(String input, int number){
        if (input.equals("FastTrack") && number <= 3) {
            return (input + number);
        } else if (!input.equals("FastTrack") && number >= 4){
            return (number + input);
        }
        return "";
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

    public void pressedKeyWithoutConcatenation(int number) {
        switch (number) {
            case 9: System.out.println("The number is: 9!"); break;
            case 8: System.out.println("The number is: 8!"); break;
            case 7: System.out.println("The number is: 7!"); break;
            case 6: System.out.println("The number is: 6!"); break;
            case 5: System.out.println("The number is: 5!"); break;
            case 4: System.out.println("The number is: 4!"); break;
            case 3: System.out.println("The number is: 3!"); break;
            case 2: System.out.println("The number is: 2!"); break;
            case 1: System.out.println("The number is: 1!"); break;
            case 0: System.out.println("The number is: 0!"); break;
        //  default: System.out.println("Not allowed");
        }
    }

    public boolean isNumberEven(int number) {
        // or just: return number % 2 == 0
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        // or just return age >= 18
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public float checkMaxNumber(float firstNumber, float secondNumber, float thirdNumber) {
        float max;
//        max = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        if (firstNumber >= secondNumber) {
            if (firstNumber >= thirdNumber) {
                max = firstNumber;
            } else {
                max = thirdNumber;
            }
        } else if (secondNumber >= thirdNumber) {
            max = secondNumber;
        } else {
            max = thirdNumber;
        }
        return max;
    }

    // Exercises from class
    public int checkComparison(int number) {
        if (number >=2 && number <= 8) {
            return number;
        }
        return 0;
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

    // For loops homework

    public void printNumbersToPositive(int number) {
        if (number <= 100) {
            for (int i = number; i <= 100; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = number; i >= 100; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public void printNumbersToNegative(int number) {
        if (number >= -100) {
            for (int i = number; i >= -100; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = number; i <= -100; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void printValuesBetweenWithFor(int firstValue, int secondValue) {
        for (int i = firstValue; i <= secondValue; i++) {
            System.out.print(i + " ");
        }
    }

    public void printCheckedValuesBetweenWithFor(int firstValue, int secondValue) {
        if (firstValue <= secondValue) {
            for (int i = firstValue; i <= secondValue; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = secondValue; i <= firstValue; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void printEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void printUnevenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public int printSum(int startNumber) {
        int sum = 0;
        for (int i = startNumber; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float printAverage(int startNumber) {
        int sum = 0;
        float count = 0;
        for (int i = startNumber; i <= 100; i++) {
            sum += i;
            count ++;
        }
        return (sum/count);
    }

    public void printPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    While Homework

    public void printNumbersToPositiveWithWhile(int number) {
        if (number <= 100) {
            while (number <= 100) {
                System.out.print(number + " ");
                number++;
            }
        } else {
            while (number >= 100) {
                System.out.print(number + " ");
                number--;
            }
        }
    }

    public void printNumbersToNegativeWithWhile(int number) {
        if (number <= -100) {
            while (number <= -100) {
                System.out.print(number + " ");
                number++;
            }
        } else {
            while (number >= -100) {
                System.out.print(number + " ");
                number--;
            }
        }
    }

    public void printValuesBetween(int firstValue, int secondValue) {
        while (firstValue <= secondValue) {
            System.out.print(firstValue + " ");
            firstValue++;
        }
    }

    public void printCheckedValuesBetween(int firstValue, int secondValue) {
        if (firstValue <= secondValue) {
            while (firstValue <= secondValue) {
                System.out.print(firstValue + " ");
                firstValue++;
            }
        } else {
            while (secondValue <= firstValue) {
                System.out.print(secondValue + " ");
                secondValue++;
            }
        }
    }

    public void printEvenNumbersWithWhile() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public void printUnevenNumbersWithWhile() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public void printSumAndAverage() {
        int sum = 0;
        float count = 0;
        int i = 111;
        while (i <= 8899) {
            sum += i;
            i++;
            count ++;
        }
        System.out.println("The sum of the numbers between 111 and 8899 is: " + sum);
        System.out.println("The average of the numbers between 111 and 8899 is: " + sum/count);
    }

    public void printAverageDivisibilityWithSeven(int startValue, int endValue) {
        int sum = 0;
        float count = 0;
        int i = startValue;
        while (i <= endValue) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println("The average of the numbers divisible by seven is: " + sum/count);
    }

    public void printFibonacci() {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        int count = 0;
        System.out.print("The first 20 Fibonacci numbers are: " + firstNumber + " " + secondNumber + " ");
        while (count < 18) {
            nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            count++;
        }
    }

    public void CozaLozaWoza() {
        int count = 0;
        int i = 1;
        while (i <= 110) {
            if (count % 11 == 0 && count != 0) {
                System.out.println("");
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
                count++;
                i++;
                continue;
            }
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
                count++;
                i++;
                continue;
            }
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
                count++;
                i++;
                continue;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
                count++;
                i++;
                continue;
            }
            if (i % 7 == 0) {
                System.out.print("Woza ");
                count++;
                i++;
                continue;
            }
            if (i % 5 == 0) {
                System.out.print("Loza ");
                count++;
                i++;
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("Coza ");
                count++;
                i++;
                continue;
            }
            System.out.print(i + " ");
            count++;
            i++;
        }
    }
}
