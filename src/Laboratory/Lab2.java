package Laboratory;

public class Lab2 {

    public static void main(String[] args) {
        printMyName();
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
    // Some of the methods have been moved to Calculator class

    //2. Add, subtract, multiply and divide
    //6. Division's reminder
    // The methods have been moved to Calculator class


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
