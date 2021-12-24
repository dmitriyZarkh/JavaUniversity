package syntax.arrays;

import java.util.Scanner;

public class DivisionBySix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value % 6 == 0) {
                count++;
                sum += value;
            }
        }
        System.out.println(count + " " + sum);
    }
}
