package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    List<Integer> numbers;

    @BeforeEach
    void initIntegerList() {
        this.numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
    }


    @Test
    void testTake() {
        // BEGIN
        int n = 2;
        List<Integer> expectedList = numbers.stream().limit(n).collect(Collectors.toList());
        assertThat(App.take(numbers, n)).isEqualTo(expectedList);
        // END
    }
}
