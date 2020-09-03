public class Lab2 {

    public static void main(String[] args) {
        System.out.println("The sum is " + sum(5, 6));
        System.out.println("The sum for the four numbers is " + sumFourNumbers(5, 6, 2, 9));
        System.out.println("The subtraction result is " + sub(10, 3.3f));
        System.out.println("The multiplication result is " + multiply(5.5f, 3.3f));
        System.out.println("The division result is " + divide(25.5, 3.3));
        System.out.println("The reminder is " + modulo(25.5f, 3.3f));
    }

    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    static int sumFourNumbers(int first, int second, int third, int forth) {
        int result = first + second + third + forth;
        return result;
    }

    static float sub(float x, float y) {
        float result = x - y;
        return result;
    }

    static float multiply(float firstNum, float secondNum) {
        float result = firstNum * secondNum;
        return result;
    }

    static double divide(double firstNum, double secondNum) {
        double result = firstNum * secondNum;
        return result;
    }

    static float modulo(float firstNum, float secondNum) {
        float result = firstNum % secondNum;
        return result;
    }

}
