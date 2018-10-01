package lectures;


import beans.Car;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lecture8 {

    @Test
    public void simpleGrouping() throws Exception {
        Map<String, List<Car>> grouping = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getMake));

        grouping.forEach((s, cars) -> {
            System.out.println(s);
            cars.forEach(System.out::println);

        });

    }

    @Test
    public void groupingAndCounting() throws Exception {
        ArrayList<String> names = Lists
                .newArrayList(
                        "John",
                        "John",
                        "Mariam",
                        "Alex",
                        "Mohammado",
                        "Mohammado",
                        "Vincent",
                        "Alex",
                        "Alex"
                );

        final Map<String, Long> gropingByWithCount = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        gropingByWithCount.forEach((s, aLong) -> System.out.println("name => " + s + " Count=> " + aLong));
    }

}