package lectures;

import beans.Person;
import mockdata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lecture2 {

    @Test
    public void range() throws Exception {

        System.out.println("for i");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


    }

    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> people = MockData.getPeople();

        IntStream.range(0, 10).forEach(index -> {
            System.out.println(people.get(index));
        });
    }

    @Test
    public void intStreamIterate() throws Exception {

        IntStream.iterate(0, operand -> operand + 1)
                .filter(value -> value % 5 == 0)
                .limit(20)
                .boxed()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
