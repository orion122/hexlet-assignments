package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
//    public static void main(String[] args) {
//        scrabble("rkqodlw", "world");
//    }

    public static boolean scrabble(String str, String word) {
        List<String> list1 = Arrays.asList(str.split(""));
        String[] list2 = word.split("");

        for (String s: list2) {
            if (list1.contains(s)) {
                list1.remove(s);
            } else {
                return false;
            }
        }

        return true;
    }
}
//END
