package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String str, String word) {
        List<String> list1 = new ArrayList<>(Arrays.asList(str.split("")));
        String[] list2 = word.split("");

        for (String s: list2) {
            if (list1.contains(s.toLowerCase())) {
                list1.remove(s);
            } else {
                return false;
            }
        }

        return true;
    }
}
//END
