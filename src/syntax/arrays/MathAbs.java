package syntax.arrays;

import java.util.Scanner;

public class MathAbs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] intArray = new double[n];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Math.abs(scanner.nextDouble());
        }
        double max = Integer.MIN_VALUE;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println(max);
    }
}
