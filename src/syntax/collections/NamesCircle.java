package syntax.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class NamesCircle {



    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("Lorna");
        names.add("Desiree");
        names.add("Melissa");
        names.add("Josh");
        LinkedHashSet<String> result = new LinkedHashSet<>();
        int i = 1;
        while (names.size() != 1) {
            if (i == names.size()) {
                i = 0;
            }else if (i == names.size() + 1) {
                i = 1;
            }
            result.add(names.remove(i));
            i++;
        }
        System.out.println(result);
    }
}
