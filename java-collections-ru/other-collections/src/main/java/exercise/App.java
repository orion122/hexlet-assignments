package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> m1, Map<String, Object> m2) {
        LinkedHashMap<String, String> tmp = new LinkedHashMap<>();

        m2.entrySet()
                .forEach(m -> {
                    boolean containsKey = m1.containsKey(m.getKey());

                    if (containsKey) {
                        if (m.getValue() == m1.get(m.getKey())) {
                            tmp.put(m.getKey(), "unchanged");
                        } else {
                            tmp.put(m.getKey(), "changed");
                        }
                    } else {
                        tmp.put(m.getKey(), "added");
                    }
                });

        m1.entrySet()
                .forEach(m -> {
                    if (!tmp.containsKey(m.getKey())) {
                        tmp.put(m.getKey(), "deleted");
                    }
                });

        return tmp;
    }
}
//END
