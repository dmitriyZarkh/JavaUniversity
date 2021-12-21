package syntax.cycles;

import java.util.Scanner;

public class HappyTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int a = line.charAt(0);
        int b = line.charAt(2);
        int c = line.charAt(4);
        int d = line.charAt(6);
        int countOption = 0;
        for (int i = a; i <= b; i++) {
            for (int j = c; j <= d; j++) {
               countOption++;
            }
        }
        System.out.println(countOption);
    }
}
