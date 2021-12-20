package syntax.cycles;

import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String strNumber = Integer.toString(number);
        int result = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            result++;
        }
        System.out.println(result);
    }
}
