package syntax.arrays;

import java.util.Scanner;

public class NotHigherThanTwoPointFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arLen = scanner.nextLine();
        int intLength = Integer.parseInt(arLen);
        double[] array = new double[intLength];
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            array[i] = (int) string.charAt(i);
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
