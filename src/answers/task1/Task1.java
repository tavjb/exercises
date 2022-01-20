package answers.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(30);
    numbers.add(-1);
    numbers.add(40);
    numbers.add(2);
    numbers.add(-2);
    numbers.add(13);

    numbers = numbers.stream().filter(num -> num < 0).collect(Collectors.toList());
    System.out.println(numbers);
  }
}
