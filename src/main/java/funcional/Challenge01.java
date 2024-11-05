package funcional;

import java.util.function.Consumer;

public class Challenge01 {
    public static Consumer<String> atIndex = s -> System.out.println(s.indexOf('@'));
}
