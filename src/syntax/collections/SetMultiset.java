package syntax.collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetMultiset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int firstStore = scanner.nextInt();
        String firstStorePrices = sc.nextLine();
        int secondStore = scanner.nextInt();
        String secondStorePrices = sc.nextLine();
        String[] firstArray = firstStorePrices.split(" ");
        List<String> firstStrings = Arrays.stream(firstArray).toList();
        Set<String> firstSet = new HashSet<>(firstStrings);
        String[] secondArray = secondStorePrices.split(" ");
        List<String> secondStrings = Arrays.stream(secondArray).toList();
        Set<String> secondSet = new HashSet<>(secondStrings);
        Set<String> mergedSet = new HashSet<>(firstSet);
        mergedSet.addAll(secondSet);
        List<String> printList = new ArrayList<>(mergedSet);
        List<Integer> intPrintList = new ArrayList<>();
        for (int i = 0; i < mergedSet.size(); i++) {
            intPrintList.add(Integer.parseInt(printList.get(i)));
        }
        Collections.sort(intPrintList);
        for (int i = 0; i < intPrintList.size(); i++) {
            if (i != intPrintList.size() - 1) {
                System.out.print(intPrintList.get(i) + " ");
            } else {
                System.out.print(intPrintList.get(i));
            }
        }
    }
}
