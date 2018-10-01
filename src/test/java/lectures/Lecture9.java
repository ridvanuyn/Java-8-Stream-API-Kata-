package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import org.junit.Test;

public class Lecture9 {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};


    final Integer sumForInteger = Arrays.stream(integers).reduce(5000, (integer, integer2) -> integer + integer2).intValue();

    System.out.println(sumForInteger);

    final Integer reduce = Arrays.stream(integers).reduce(0,Integer::max).intValue();
    System.out.println(reduce);
  }


}

