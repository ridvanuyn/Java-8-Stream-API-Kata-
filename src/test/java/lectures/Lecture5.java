package lectures;


import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lecture5 {

    @Test
    public void understandingFilter() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();

        final Predicate<Car> carPredicate = car -> car.getPrice() < 20000;

        List<Car> carsFiltered = cars.stream()
                .filter(carPredicate)
                .collect(Collectors.toList());

        carsFiltered.forEach(System.out::println);
        System.out.println(carsFiltered.size());
    }


    @Test
    public void ourFirstMapping() throws Exception {
        // transform from one data type to another
        List<Person> people = MockData.getPeople();

        people.stream()
                .map(PersonDTO::map).collect(Collectors.toList())
                .forEach(System.out::println);

    }

    @Test
    public void averageCarPrice() throws Exception {
        // calculate average of car prices
        double average = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .average()
                .getAsDouble();
        System.out.println(average);

    }

    @Test
    public void test() throws Exception {
        MockData.getCars().forEach(System.out::println);
    }
}



