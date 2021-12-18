package syntax.ifelse;

import java.util.Scanner;

public class SquareEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coefficients = scanner.nextLine();
        double coefA = Double.parseDouble(String.valueOf(coefficients.charAt(0)));
        double coefB = Double.parseDouble(String.valueOf(coefficients.charAt(2)));
        double coefC = Double.parseDouble(String.valueOf(coefficients.charAt(4)));
        double root1; ;
        double root2 ;
        if (coefA == 0) {
            System.out.println("No roots");
        } else if ((coefB * coefB - 4 * coefA * coefC) <= 0) {
            System.out.println("One root " + (-1 * coefB) / (2 * coefA));
        } else {
            System.out.println("Two roots "
                    + Math.min(root1 = (-1 * coefB + (coefB * coefB - 4 * coefA * coefC)) / (2 * coefA),
                    root2 = (-1 * coefB - (coefB * coefB - 4 * coefA * coefC)) / (2 * coefA)) + " "
                    + Math.max(root1, root2));
        }
    }
}
