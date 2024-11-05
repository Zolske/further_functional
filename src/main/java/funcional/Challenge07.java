package funcional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Challenge07 {
    public static Consumer<List<Integer>> squaresNumbers =
            (listNumber) -> listNumber.replaceAll(n -> n * n);

    public static Consumer<List<Integer>> printList = number -> System.out.println(number);

    public static class Challenge08 {
        public static BiConsumer<Integer, Integer> equal = (num1, num2) -> System.out.println(num1.equals(num2));
    }
}
