package syntax.collections;

import java.util.HashSet;
import java.util.Set;

public class SymDiffMain {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(2);
        a.add(3);
        a.add(7);
        a.add(8);
        Set<Integer> b = new HashSet<>();
        b.add(5);
        b.add(6);
        b.add(2);
        b.add(4);
        b.add(7);
        Set<Integer> outcome = SymmetricDifference.diff(a, b);
        System.out.println(outcome);
    }
}
