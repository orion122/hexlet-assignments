package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();

        if (sentence.equals("")) {
            return result;
        }

        List<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        for (String w: words) {
            int n = result.getOrDefault(w, 0);
            n++;
            result.put(w, n);
        }

        return result;
    }

    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.size() == 0) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (Map.Entry<String, Integer> e: wordCount.entrySet()) {
            sb.append("\n  ").append(e.getKey()).append(": ").append(e.getValue());
        }

        sb.append("\n}");

        return sb.toString();
    }
}
//END
