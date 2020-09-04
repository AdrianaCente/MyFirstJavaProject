public class Lab2 {

    public static void main(String[] args) {
        printMyName();
        printExpressionOne();
        System.out.println("Expression two equals " + computeExpressionTwo(55, 9, 9));
        System.out.println("Expression three equals " + computeExpressionThree(20, -3, 5, 8));
        System.out.println("Expression four equals " + computeExpressionFour());
        System.out.println("The sum of  two numbers is " + sumTwoNumbers(5, 6));
        System.out.println("The sum for the four numbers is " + sumFourNumbers(5, 6, 2, 9));
        System.out.println("The subtraction's result is " + subtract(10, 3.3f));
        System.out.println("The multiplication's result is " + multiply(5.5f, 3.3f));
        System.out.println("The division's result is " + divide(25.5, 3.3));
        System.out.println("The reminder is " + modulo(25.5f, 3.3f));
        printPatternOne();
        System.out.println("The arithmetic mean is: " + computeArithmeticMean(20, 25.6, 25));
        printPatternTwo();
        System.out.printf("The temperature measured in Celsius is: %1.2f%n", convertTemperatureToCelsius(100));
        System.out.println("The distance converted from inches to meters is: " + convertToMeters(450));
        System.out.println("The velocity in m/s is: " + computeVelocityMS(100000, 1, 2, 50));
        System.out.println("The velocity in km/h is: " + computeVelocityKmH(100000, 1, 2, 50));
        System.out.println("The velocity in miles/h is: " + computeVelocityMilesH(100000, 1, 2, 50));
    }

    //  1. Methods for the previous homework computations
    static void printMyName() {
        System.out.println("Hello \nAdriana!");
    }

    static void printExpressionOne() {
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
    }

    static float computeExpressionTwo(float a, float b, float c) {
        float result = (a + b) % c;
        return result;
    }

    static double computeExpressionThree(float a, float b, float c, float d) {
        double result = a + b * c / d;
        return result;
    }

    static float computeExpressionFour() {
        float result = 5 + 2 * 15 / 3 - 8 % 3;
        return result;
    }

    //2. Add, subtract, multiply and divide
    //6. Division's reminder
    static int sumTwoNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    static int sumFourNumbers(int first, int second, int third, int forth) {
        int result = first + second + third + forth;
        return result;
    }

    static float subtract(float x, float y) {
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

    //  3. Pattern 1
    static void printPatternOne() {
        System.out.println("   J    a   v     v  a   \n   J   a a   v   v  a a  \nJ  J  aaaaa   v v  aaaaa \n JJ  a     a   v  a     a");
    }

    //  4. Arithmetic mean
    static double computeArithmeticMean(double firstNum, double secondNum, double thirdNum) {
        return (firstNum +  secondNum + thirdNum) / 3;
    }

    //  5. Pattern 2
    // I tried instead of "o" to use \uFFEE, but the pattern wouldn't align properly.
    static void printPatternTwo() {
        System.out.println(" +\"\"\"\"\"+  \n[| o o |]\n |  ^  | \n | '_' | \n +-----+ ");
    }

    //  7. Temperature F to C
    static float convertTemperatureToCelsius(float tempFahrenheit) {
        float tempCelsius = (tempFahrenheit - 32) * 5 / 9f;
        return tempCelsius;
    }

    //  8. Convert inch to meters
    static double convertToMeters(double distanceInch) {
        return distanceInch * 0.0254;
    }

    //  9. Find velocity
    static double computeVelocityMS(double distance, int hours, int minutes, int seconds) {
        double velocityMS = distance / (hours * 3600 + minutes * 60 + seconds);
        return velocityMS;
    }

    static double computeVelocityKmH(double distance, int hours, int minutes, int seconds) {
    //  m/s -> km/h: (1 / 1000) / (1 / 3600) = 0.001 / 0.0002777 = 3.6
        double velocityKmH = computeVelocityMS(distance, hours, minutes, seconds) * 3.6;
        return velocityKmH;
    }

    static double computeVelocityMilesH(double distance, int hours, int minutes, int seconds) {
    //  m/s -> miles/h: (1 / 1609) / (1 / 3600) = 0.000621 / 0.0002777 = 2.237
        double velocityMilesH = computeVelocityMS(distance, hours, minutes, seconds) * 2.237;
        return velocityMilesH;
    }
}
