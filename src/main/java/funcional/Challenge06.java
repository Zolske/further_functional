package funcional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Challenge06 {
    public static Consumer<List<String>> printEachToConsole = email -> email.forEach(name -> System.out.println(name));
}
