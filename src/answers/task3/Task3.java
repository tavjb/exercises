package answers.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(30);
    numbers.add(-1);
    numbers.add(-30);
    numbers.add(40);
    numbers.add(2);
    numbers.add(-33);
    numbers.add(-2);
    numbers.add(13);
    numbers.add(-60);

    List<String> numStrings = numbers.stream()
        .filter(num -> num < 0)
        .filter(num -> num % 3 == 0)
        .map(num -> "number: " + num)
        .collect(Collectors.toList());
    System.out.println(numStrings);
  }
}
