public class Calculator {
    public int sumTwoNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    public int sumFourNumbers(int first, int second, int third, int forth) {
        int result = first + second + third + forth;
        return result;
    }

    public float subtract(float x, float y) {
        float result = x - y;
        return result;
    }

    public float multiply(float firstNum, float secondNum) {
        float result = firstNum * secondNum;
        return result;
    }

    public double divide(double firstNum, double secondNum) {
        double result = firstNum * secondNum;
        return result;
    }

    public float modulo(float firstNum, float secondNum) {
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
