package syntax.cycles;

import java.util.Scanner;

public class OperationsQuantity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        int multiply = 0;
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '*') {
                multiply++;
            } else if (expression.charAt(i) == '+') {
                plus++;
            } else if (expression.charAt(i) == '-') {
                minus++;
            }
        }
        System.out.println("* " + multiply);
        System.out.println("+ " + plus);
        System.out.println("- " + minus);
    }
}
