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

        for (Entry<String, String> e: map.entrySet()) {
            kvStorage.set(e.getValue(), e.getKey());
            kvStorage.unset(e.getKey());
        }
    }
}
// END
