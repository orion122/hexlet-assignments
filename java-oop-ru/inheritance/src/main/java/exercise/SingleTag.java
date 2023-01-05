package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
class SingleTag extends Tag {
    private String tagName;
    private Map<String, String> attrs;

    public SingleTag(String tagName, Map<String, String> attrs) {
        this.tagName = tagName;
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        return ("<" + tagName + " " + attrs.entrySet().stream()
                .map(e -> e.getKey() + "=" + "\"" + e.getValue() + "\"")
                .collect(Collectors.joining(" "))).trim() + ">";
    }
}
// END
