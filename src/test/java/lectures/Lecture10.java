package lectures;


import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture10 {

    private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
            Lists.newArrayList("Mariam", "Alex", "Ismail"),
            Lists.newArrayList("John", "Alesha", "Andre"),
            Lists.newArrayList("Susy", "Ali")
    );

    @Before
    public void setUp() {
        System.out.println(arrayListOfNames);
    }

    @Test
    public void withoutFlatMap() throws Exception {
//    [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]

        List<String> names = Lists.newArrayList();

        for (List<String> listOfNames : arrayListOfNames) {
            for (String name : listOfNames) {
                names.add(name);
            }
        }

        System.out.println(names);

    }

    @Test
    public void withFlatMap() throws Exception {
//   [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]

        final List<String> names = arrayListOfNames.stream()
                .flatMap(strings -> strings.stream().map(String::toUpperCase).map(s -> s.contains("A")? s+"içinde A var ".toUpperCase() : s.toLowerCase()))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);

    }

}

