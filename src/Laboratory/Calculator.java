package Laboratory;

public class Calculator {
    public ReadFromKeyboard readKeyboard = new ReadFromKeyboard();
    public int sumTwoNumbers() {
        int a = readKeyboard.getInt();
        int b = readKeyboard.getInt();
        int result = a + b;
        return result;
    }

    public int sumFourNumbers() {
        int first = readKeyboard.getInt();
        int second = readKeyboard.getInt();
        int third = readKeyboard.getInt();
        int forth = readKeyboard.getInt();
        int result = first + second + third + forth;
        return result;
    }

    public float subtract() {
        float x = readKeyboard.getFloat();
        float y = readKeyboard.getFloat();
        float result = x - y;
        return result;
    }

    public float multiply() {
        float firstNum = readKeyboard.getFloat();
        float secondNum = readKeyboard.getFloat();
        float result = firstNum * secondNum;
        return result;
    }

    public double divide() {
        double firstNum = readKeyboard.getDouble();
        double secondNum = readKeyboard.getDouble();
        double result = firstNum * secondNum;
        return result;
    }

    public float modulo() {
        float firstNum = readKeyboard.getFloat();
        float secondNum = readKeyboard.getFloat();
        float result = firstNum % secondNum;
        return result;
    }

    public void printExpressionOne() {
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
    }

    public float computeExpressionTwo(float a, float b, float c) {
        float result = (a + b) % c;
        return result;
    }

    public double computeExpressionThree(float a, float b, float c, float d) {
        double result = a + b * c / d;
        return result;
    }

    public float computeExpressionFour() {
        float result = 5 + 2 * 15 / 3 - 8 % 3;
        return result;
    }
}
