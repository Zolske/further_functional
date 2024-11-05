package funcional;

import java.util.function.BiConsumer;

public class Challenge05 {
    public static BiConsumer<String, Integer> greeting =
            (name, age) -> System.out.println("Hello " + name + " you are " + age + "s old.");
}
