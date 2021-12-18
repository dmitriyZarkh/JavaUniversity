package syntax.ifelse;

public class CDs {

        static double ifHundred;
        static double ifTwenty;
        static double ifOne;

    public static void main(String[] args) {
        ifHundred = 100.0 / 100.0;
        ifTwenty = 30.0 /  20.0;
        ifOne = 2.0 / 1.0;

        double min = 0;
        double minTotalForThousand = 0;
        if (ifHundred < ifTwenty) {
            if (ifHundred < ifOne) {
              min = ifHundred;
            }
        }

        minTotalForThousand = min * 1000.0;

        System.out.println(ifHundred);
        System.out.println(ifTwenty);
        System.out.println(ifOne);
        System.out.println(min);
        System.out.println(minTotalForThousand);
    }
}
