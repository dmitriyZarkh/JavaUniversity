package ifElse;

public class GradesOfAchievement {

    public static void main(String[] args) {
        int grade = 11;

        if (grade >= 1 && grade <= 3) {
            System.out.println("Initial");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println("Average");
        } else if (grade >= 7 && grade <= 9) {
            System.out.println("Sufficitnt");
        } else if (grade >= 10 && grade <= 12) {
            System.out.println("High");
        }
    }
}
