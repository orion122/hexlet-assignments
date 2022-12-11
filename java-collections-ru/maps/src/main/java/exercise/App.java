package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();

        if (sentence.equals("")) {
            return result;
        }

        List<String> words1 = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        List<String> words2 = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        for (String w1: words1) {
            if (words2.contains(w1)) {
                words2.remove(w1);
                result.put(w1, result.getOrDefault(w1, 0) + 1);
            }
        }

//        System.out.println(sentence);
//        System.out.println(result);

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
