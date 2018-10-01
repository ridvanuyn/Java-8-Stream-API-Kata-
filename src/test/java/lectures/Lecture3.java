package lectures;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Lecture3 {

    @Test
    public void min() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

        Integer minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(minNumber);
    }

    @Test
    public void max() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

        Integer max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        assertThat(max).isEqualTo(100);
        System.out.println(max);
    }
}
