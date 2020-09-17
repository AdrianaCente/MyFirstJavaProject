public class Lab4 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        op.printSumAndAverage(1, 100);
        op.printNumbersToValue(-120);
        System.out.println("--------------------------------------");
        op.printValuesBetween(50, 34);

        // Fibonacci: 0,1,1,2,3,5,8,13,21,34,55...
        op.printFibonacci();

        System.out.println("CozaLozaWoza");
        op.CozaLozaWoza();
    }
}
