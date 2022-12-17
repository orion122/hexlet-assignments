package exercise;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> free = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return emails.stream()
                .filter(e -> free.contains(e.split("@")[1]))
                .count();
    }
}
// END
