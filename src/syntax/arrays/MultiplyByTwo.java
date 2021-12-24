package syntax.arrays;

import java.util.Scanner;

public class MultiplyByTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] >= 0) {
                array[i] *= 2;
            }
            System.out.print(array[i]);
        }
    }
}
