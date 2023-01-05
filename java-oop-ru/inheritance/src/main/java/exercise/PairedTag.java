package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    private String tagName;
    private Map<String, String> attrs;
    private String body;
    private List<Tag> children;

    public PairedTag(String tagName, Map<String, String> attrs, String body, List<Tag> children) {
        this.tagName = tagName;
        this.attrs = attrs;
        this.body = body;
        this.children = children;
    }


    @Override
    public String toString() {
        return ("<" + tagName + " " + attrs.entrySet().stream()
                .map(e -> e.getKey() + "=" + "\"" + e.getValue() + "\"").collect(Collectors.joining(" "))).trim() +
                ">" + body +
                children.stream().map(Tag::toString).collect(Collectors.joining()) +
                "</" + tagName + ">";
    }
}
// END
