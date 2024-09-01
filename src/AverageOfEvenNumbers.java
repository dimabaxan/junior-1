import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfEvenNumbers {
        public static void main(String[] args) {

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                OptionalDouble average = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(n -> n)
                        .average();


                if (average.isPresent()) {
                        System.out.println("Среднее значение чётных чисел: " + average.getAsDouble());
                } else {
                        System.out.println("В списке нет чётных чисел.");
                }
        }
}
