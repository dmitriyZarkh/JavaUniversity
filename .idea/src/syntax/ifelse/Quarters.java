package syntax.ifelse;

import java.util.Scanner;

public class Quarters {

    static Scanner scanner = new Scanner(System.in);
    static String line = scanner.nextLine();
    static int x = Integer.parseInt(String.valueOf(line.charAt(0)));
    static int y = Integer.parseInt(String.valueOf(line.charAt(2)));

    public static void main(String[] args) {
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x > 0 && y < 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x < 0 && y > 0) {
            System.out.println(4);
        } else {
            System.out.println(0);
        }
    }
}
