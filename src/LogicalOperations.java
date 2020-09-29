import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;

public class LogicalOperations {

    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
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

    public String checkTextAndNumber(String input, int number) {
        if (input.equals("FastTrack") && number <= 3) {
            return (input + number);
        } else if (!input.equals("FastTrack") && number >= 4) {
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
            case 9:
                System.out.println("The number is: 9!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 7:
                System.out.println("The number is: 7!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 0:
                System.out.println("The number is: 0!");
                break;
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
        if (number >= 2 && number <= 8) {
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
                System.out.println(number);
                break;
            default:
                System.out.println("Not allowed");
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
            count++;
        }
        return (sum / count);
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
            count++;
        }
        System.out.println("The sum of the numbers between 111 and 8899 is: " + sum);
        System.out.println("The average of the numbers between 111 and 8899 is: " + sum / count);
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
        System.out.println("The average of the numbers divisible by seven is: " + sum / count);
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


//    Array

    public int[] getArrayToNumber(int maxValue) {
        int[] myArray = new int[maxValue];
        for (int i = 0; i < maxValue; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] myArray) {
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public int[] evenArray(int[] resultedArray) {
        int[] wholeArray = getArrayToNumber(100);
        int j = 0;
        for (int i = 0; i < wholeArray.length; i++) {
            if (wholeArray[i] % 2 == 0) {
                resultedArray[j] = wholeArray[i];
                j++;
            }
        }
        return resultedArray;
    }

    public void printLinePattern(int receivedValue) {
        String[] myArray = new String[receivedValue];
        for (int j = 0; j < receivedValue; j++) {
            for (int i = 0; i < receivedValue; i++) {
                myArray[i] = "-";
                System.out.print(myArray[i] + " ");
            }
            System.out.println();
        }
    }

    public float computeAverage(int[] secondArray) {
        int sum = 0;
        for (int i = 0; i < secondArray.length; i++) {
            sum += secondArray[i];
        }
        return sum / secondArray.length;
    }

    public boolean isValueInArray(String[] receivedArray, String valueToCheck) {
        for (int i = 0; i < receivedArray.length; i++) {
            if (receivedArray[i].toLowerCase().equals(valueToCheck)) {
                return true;
            }
        }
        return false;
    }

    public int isNumberInArray(int[] receivedArray, int valueToCheck) {
        for (int i = 0; i < receivedArray.length; i++) {
            if (receivedArray[i] == valueToCheck) {
                return i;
            }
        }
        return -1;
    }

    public int[] arrayWithoutReceivedValue(int[] receivedArray, int valueToCheck) {
        int[] resultedArray = new int[receivedArray.length - 1];
        int j = 0;
        try {
            for (int i = 0; i < receivedArray.length; i++) {
                if (receivedArray[i] == valueToCheck) {
                    continue;
                }
                resultedArray[j] = receivedArray[i];
                j++;
            }
            return resultedArray;
        } catch (ArrayIndexOutOfBoundsException e) {
            return receivedArray;
        }
    }

    public int minValueInArray(int[] receivedArray) {
        int min = receivedArray[0];
        for (int i = 0; i < receivedArray.length; i++) {
            if (receivedArray[i] < min) {
                min = receivedArray[i];
            }
        }
        return min;
    }

    public int secondMinInArray(int[] receivedArray) {
        int firstMin = minValueInArray(receivedArray);
        int[] arrayWithoutFirstMin = arrayWithoutReceivedValue(receivedArray, firstMin);
        int secondMin = minValueInArray(arrayWithoutFirstMin);
        return secondMin;
    }

    public int[] sortArray(int[] receivedArray) {
        int temp = 0;
        for (int i = 0; i < receivedArray.length; i++) {
            for (int j = i + 1; j < receivedArray.length; j++)
                if (receivedArray[i] > receivedArray[j]) {
                    temp = receivedArray[i];
                    receivedArray[i] = receivedArray[j];
                    receivedArray[j] = temp;
                }
        }
        return receivedArray;
    }

    public int secondMinInArraySecond(int[] receivedArray) {
        int[] sortedArray = sortArray(receivedArray);
        return sortedArray[1];
    }

    public int[] copiedArray(int[] receivedArray, int[] resultedArray) {
        int j = 0;
        for (int i = 0; i < receivedArray.length; i++) {
            resultedArray[j] = receivedArray[i];
            j++;
        }
        return resultedArray;
    }

    public int[] insertElementInArray(int[] receivedArray, int sentIndex, int newValue) {
        for (int i = receivedArray.length - 1; i > sentIndex; i--) {
            receivedArray[i] = receivedArray[i - 1];
        }
        receivedArray[sentIndex] = newValue;
        return receivedArray;
    }

    public void findMaxMinArray(int[] receivedArray) {
        int max = receivedArray[0];
        int min = receivedArray[0];
        for (int i = 0; i < receivedArray.length; i++) {
            if (receivedArray[i] > max) {
                max = receivedArray[i];
            }
            if (receivedArray[i] < min) {
                min = receivedArray[i];
            }
        }
        System.out.println("Max from the array is: " + max + ". Min from the array is: " + min + ".");
    }

    public int[] reverseArray(int[] receivedArray) {
        int[] resultedArray = new int[receivedArray.length];
        int i = 0;
        for (int j = receivedArray.length - 1; j >= 0; j--) {
            resultedArray[i] = receivedArray[j];
            i++;
        }
        return resultedArray;
    }

    public int[] reverseArrayTwo(int[] receivedArray) {
        int temp = 0;
        for (int j = 0; j <= receivedArray.length / 2; j++) {
            temp = receivedArray[j];
            receivedArray[j] = receivedArray[receivedArray.length - j - 1];
            receivedArray[receivedArray.length - j - 1] = temp;
        }
        return receivedArray;
    }

    public void findDuplicateValues(int[] receivedArray) {
        int count = 0;
        for (int i = 0; i < receivedArray.length; i++) {
            for (int j = i + 1; j < receivedArray.length; j++) {
                if (receivedArray[i] == receivedArray[j]) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println(receivedArray[i]);
                count = 0;
            }
        }
    }

    public void findCommonElementsInArrays(String[] firstArray, String[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    System.out.println(firstArray[i] + " ");
                }
            }
        }
    }

//    Lists

    public void displayShortList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));
    }

    public List<Integer> addElementList(List<Integer> myList, int number) {
        int listSize = myList.size();
        myList.add(listSize, number);
        return myList;
    }

    public void displayListElements(List<Integer> myList, int value) {
        for (int i = myList.indexOf(value); i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public void displayReversedList(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }

    public List<String> addElementAtPosition(List<String> myList, int valueIndex, String value) {
        myList.add(valueIndex, value);
        return myList;
    }

    public List<Integer> addElementOnFirstPosition(List<Integer> myList, int number) {
        myList.add(0, number);
        return myList;
    }

    public void displayDetailedList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++)
            System.out.println("Pe pozitia " + i + " valoarea este " + myList.get(i) + ".");
    }

    public int findMaxNumberInList(List<Integer> myList) {
        int max = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > max) {
                max = myList.get(i);
            }
        }
        return max;
    }

    public List<Integer> getEvenListElements(List<Integer> receivedList) {
        List<Integer> resultedList = new ArrayList<Integer>();
        for (int i = 0; i < receivedList.size(); i++) {
            if (receivedList.get(i) % 2 == 0) {
                resultedList.add(receivedList.get(i));
            }
        }
        return resultedList;
    }

    public List<Integer> switchElementsInList(List<Integer> receivedList, int valueOne, int valueTwo) {
        int indexOne = 0;
        int indexTwo = 0;
        if ((!receivedList.contains(valueOne)) && (!receivedList.contains(valueTwo))) {
            System.out.println("One/both of the value(s) provided are not in the list. The initial list will be returned.");
            return receivedList;
        }
        for (int i = 0; i < receivedList.size(); i++) {
            if (receivedList.get(i).equals(valueOne)) {
                indexOne = receivedList.indexOf(receivedList.get(i));
            }
            if (receivedList.get(i).equals(valueTwo)) {
                indexTwo = receivedList.indexOf(receivedList.get(i));
            }
        }
        receivedList.set(indexOne, valueTwo);
        receivedList.set(indexTwo, valueOne);

//      if params valueOne and valueTwo were indexes:
//        int temp = receivedList.get(valueOne);
//        receivedList.set(valueOne, receivedList.get(valueTwo));
//        receivedList.set(valueTwo, temp);

        return receivedList;
    }

    public List<Integer> sortListAscending(List<Integer> receivedList) {
        int temporaryVariable;
        for (int i = 0; i < receivedList.size(); i++) {
            for (int j = i + 1; j < receivedList.size(); j++) {
                if (receivedList.get(i) > receivedList.get(j)) {
                    temporaryVariable = receivedList.get(i);
                    receivedList.set(i, receivedList.get(j));
                    receivedList.set(j, temporaryVariable);
                }
            }
        }
        return receivedList;
    }

    public void wait(int value) {
        try {
            Thread.sleep(value * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
