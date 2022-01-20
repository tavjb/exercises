package answers.task4bonus;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task4 {

  @Data
  @AllArgsConstructor
  private static class Book {
    /*
      We haven't learned this, in this example this "nested class" is like a regular class
      if you're interested, read about this online :)
    */
    private String title;
    private double price;
  }

  public static void main(String[] args) {
    Double[] prices = { 20.5, 15.0, 70.0 };
    String[] titles = { "Harry potter", "The alchemist", "Effective Java" };

    // IntStream.range creates a stream of integers from 0 to prices.length, which means a stream of 0 - 2
    List<Book> books = IntStream.range(0, prices.length).mapToObj( i ->
        new Book(titles[i], prices[i])
    ).collect(Collectors.toList());

    System.out.println(books);
  }
}
