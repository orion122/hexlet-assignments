package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        List<String> lines = Arrays.asList(content.split("\n"));

        return lines.stream()
                .filter(l -> l.startsWith("environment"))
                .map(l -> {
                    var start = l.indexOf("\"");
                    var end = l.lastIndexOf("\"");
                    return l.substring(start + 1, end);
                })
                .flatMap(l -> Arrays.stream(l.split(","))
                        .filter(j -> j.startsWith("X_FORWARDED_"))
                        .map(s -> s.replace("X_FORWARDED_", "")))
                .collect(Collectors.joining(","));
    }
}
//END
