package syntax.arrays;

import java.util.Scanner;

public class NotHigherThanTwoPointFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arLen = scanner.nextInt();
        double[] array = new double[arLen];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        int index = 101;
        double value = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 2.5) {
                index = i;
                value = array[i];
                break;
            }
        }
        if (index != 101) {
            System.out.print(index + " " + String.format("%.2f", value));
        } else {
            System.out.print("Not Found");
        }
    }
}
