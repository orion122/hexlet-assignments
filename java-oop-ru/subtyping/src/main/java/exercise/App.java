package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage kvStorage) {
        Map<String, String> map = kvStorage.toMap();
        HashMap<String, String> tmp = new HashMap<>();

        for (Entry<String, String> e: map.entrySet()) {
            tmp.put(e.getValue(), e.getKey());
        }

        for (Entry<String, String> e: tmp.entrySet()) {
            kvStorage.unset(e.getKey());
            kvStorage.set(e.getKey(), e.getValue());
        }
    }
}
// END
