package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture6 {

    final Predicate<Integer> integerPredicateForArrange5And10 = integer -> integer < 10 & integer > 5;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    final Integer filteredNumber = Arrays.stream(numbers)
            .filter(integerPredicateForArrange5And10)
            .findAny()
            .get();

    System.out.println(filteredNumber);


  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    final Integer filteredFirst = Arrays.stream(numbers)
            .filter(integerPredicateForArrange5And10)
            .findFirst()
            .get();

    System.out.println(filteredFirst);

  }
}

