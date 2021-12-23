package syntax.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayNumbers = new int[n];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = scanner.nextInt();
            if (arrayNumbers[i] > 0) {
                arrayNumbers[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(arrayNumbers));
    }
}
