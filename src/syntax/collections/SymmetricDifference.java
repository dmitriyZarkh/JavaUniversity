package syntax.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> diff(Set<Integer> a, Set<Integer> b) {
        if (a.size() == 0) {
            return b;
        }
        if (b.size() == 0) {
            return a;
        }
        if (a.isEmpty() && b.isEmpty()) {
            return a;
        }
        Object[] right = a.toArray();
        Object[] left = b.toArray();
        Set<Integer> diffSet = new HashSet<>();
        for (int i = 0; i < left.length; i++) {
            boolean found = false;
            for (int j = 0; j < right.length; j++) {
                if (left[i].equals(right[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                diffSet.add((Integer) left[i]);
            }
        }
        boolean got = false;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i].equals(left[j])) {
                    got = true;
                    break;
                }
            }
            if (!got) {
                diffSet.add((Integer) right[i]);
            }
            got = false;
        }
        return diffSet;
    }
}
