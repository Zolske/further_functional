package funcional;

import java.util.function.Consumer;

public class Challenge04 {
    public static Consumer<String> takeUsername = s -> System.out.println(s.substring(0, s.indexOf("@")));
}
