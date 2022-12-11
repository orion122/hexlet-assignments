package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        boolean in;

        for (Map<String, String> b: books) {
            in = true;

            for (String k: where.keySet()) {
                if (!b.get(k).equals(where.get(k))) {
                    in = false;
                }
            }

            if (in) {
                result.add(b);
            }
        }

        System.out.println(result);

        return result;
    }
}
//END
