package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        return homes.stream()
                .limit(n)
                .sorted(Comparator.comparing(Home::getArea))
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
